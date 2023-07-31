package com.beans.familybusiness.repository;

import com.beans.familybusiness.entity.EducationContent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EducationContentRepository extends JpaRepository<EducationContent, Long> {
    // Custom query methods or additional CRUD operations can be defined here if needed
}
