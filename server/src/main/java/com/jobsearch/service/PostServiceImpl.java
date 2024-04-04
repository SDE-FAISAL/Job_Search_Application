package com.jobsearch.service;

import com.jobsearch.dao.PostDao;
import com.jobsearch.dto.PostDTO;
import com.jobsearch.model.PostModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceImpl implements PostService{
    @Autowired
    PostDao postDao;
    @Override
    public PostModel savePost(PostDTO postDTO) {
        PostModel postModel = new PostModel();

        postModel.setProfile(postDTO.getProfile());
        postModel.setType(postDTO.getType());
        postModel.setSalary(postDTO.getSalary());
        postModel.setExperience(postDTO.getExperience());
        postModel.setDescription(postDTO.getDescription());
        postModel.setTechnology(postDTO.getTechnology());

        return postDao.save(postModel);

    }

    @Override
    public List<PostModel> getAllPosts() {
        return postDao.findAll();
    }
}
