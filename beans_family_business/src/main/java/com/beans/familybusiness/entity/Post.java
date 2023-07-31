package com.beans.familybusiness.entity;

import java.util.List;

public class Post {

    private Long id;
    private String content;
    private List<Comment> comments;
    // Other fields and getters/setters
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public List<Comment> getComments() {
		return comments;
	}
	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}
}
