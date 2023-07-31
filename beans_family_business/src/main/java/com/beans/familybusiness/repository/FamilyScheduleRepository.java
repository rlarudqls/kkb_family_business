package com.beans.familybusiness.repository;

import com.beans.familybusiness.entity.FamilySchedule;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FamilyScheduleRepository extends JpaRepository<FamilySchedule, Long> {
    // Custom query methods or additional CRUD operations can be defined here if needed
}
