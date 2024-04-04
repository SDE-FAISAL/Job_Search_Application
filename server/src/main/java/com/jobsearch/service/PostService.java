package com.jobsearch.service;

import com.jobsearch.dto.PostDTO;
import com.jobsearch.model.PostModel;

import java.util.List;

public interface PostService {

    public PostModel savePost(PostDTO postDTO);

    public default List<PostModel> getAllPosts() {
        return null;
    }
}
