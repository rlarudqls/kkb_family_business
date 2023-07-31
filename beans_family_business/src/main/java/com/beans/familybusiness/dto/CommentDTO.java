package com.beans.familybusiness.dto;

import java.time.LocalDateTime;

public class CommentDTO {

    private Long id;
    private PostDTO post;
    private UserDTO user;
    private String content;
    private LocalDateTime createdAt;

    // Constructors (if needed)...

    // Getters
    public Long getId() {
        return id;
    }

    public PostDTO getPost() {
        return post;
    }

    public UserDTO getUser() {
        return user;
    }

    public String getContent() {
        return content;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    // Setters
    public void setId(Long id) {
        this.id = id;
    }

    public void setPost(PostDTO post) {
        this.post = post;
    }

    public void setUser(UserDTO user) {
        this.user = user;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    // Add other methods or constructors as needed...
}
