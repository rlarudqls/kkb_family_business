package com.beans.familybusiness.repository;

import com.beans.familybusiness.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    // Custom query methods or additional CRUD operations can be defined here if needed
}
