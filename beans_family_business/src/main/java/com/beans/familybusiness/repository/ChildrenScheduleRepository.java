package com.beans.familybusiness.repository;

import com.beans.familybusiness.entity.ChildrenSchedule;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChildrenScheduleRepository extends JpaRepository<ChildrenSchedule, Long> {
    // Custom query methods or additional CRUD operations can be defined here if needed
}
