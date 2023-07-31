package com.beans.familybusiness.controller;

import com.beans.familybusiness.entity.Post;
import com.beans.familybusiness.service.PostService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/community")
public class CommunityController {

    private final PostService postService;

    public CommunityController(PostService postService) {
        this.postService = postService;
    }

    // Controller methods (getters and setters) here...

}
