package com.beans.familybusiness.repository;

import com.beans.familybusiness.entity.Benefit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BenefitRepository extends JpaRepository<Benefit, Long> {
    // Custom query methods or additional CRUD operations can be defined here if needed
}
