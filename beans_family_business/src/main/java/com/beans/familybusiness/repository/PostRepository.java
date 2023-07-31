package com.beans.familybusiness.repository;

import com.beans.familybusiness.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
    // Custom query methods or additional CRUD operations can be defined here if needed
}
