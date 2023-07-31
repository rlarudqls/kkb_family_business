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

    @GetMapping("/list")
    public String listPosts(Model model) {
        List<Post> posts = postService.getAllPosts();
        model.addAttribute("posts", posts);
        return "community/list";
    }

    @GetMapping("/{id}")
    public String viewPost(@PathVariable Long id, Model model) {
        Post post = postService.getPostById(id);
        model.addAttribute("post", post);
        return "community/view";
    }

    // TODO: Implement create, edit, and delete methods for posts and comments
}
