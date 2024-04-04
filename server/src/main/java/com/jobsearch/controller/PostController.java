package com.jobsearch.controller;

import ch.qos.logback.classic.Logger;
import com.jobsearch.constant.APIConstants;
import com.jobsearch.dto.PostDTO;
import com.jobsearch.model.PostModel;
import com.jobsearch.service.PostService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
@RequiredArgsConstructor
@CrossOrigin
public class PostController {

    final PostService postService;


    @RequestMapping(APIConstants.SAVE_POST)
    public PostModel savePost(@Valid @RequestBody PostDTO postDTORequest){
        
        log.info("Saving post #####");

        return  this.postService.savePost(postDTORequest);

    }

    @GetMapping(APIConstants.GET_ALL_POSTS)
    public List<PostModel> getAllPosts() {
        log.info("Getting all the posts #####");
        return this.postService.getAllPosts();
    }
}
