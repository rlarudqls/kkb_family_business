package com.beans.familybusiness.repository;

import com.beans.familybusiness.entity.WorkLifeBalanceTip;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkLifeBalanceTipRepository extends JpaRepository<WorkLifeBalanceTip, Long> {
    // Custom query methods or additional CRUD operations can be defined here if needed
}
