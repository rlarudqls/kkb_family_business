package com.beans.familybusiness.service;

import com.beans.familybusiness.dto.PostDTO;
import java.util.List;

public interface PostService {
    PostDTO getPostById(Long id);
    List<PostDTO> getAllPosts();
    PostDTO createPost(PostDTO postDTO);
    PostDTO updatePost(Long id, PostDTO postDTO);
    void deletePost(Long id);
}
