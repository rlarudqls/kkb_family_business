package com.beans.familybusiness.repository;

import com.beans.familybusiness.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Long> {
}
