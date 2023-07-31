package com.beans.familybusiness.repository;

import com.beans.familybusiness.entity.ChildSchedule;
import org.springframework.data.repository.CrudRepository;

public interface ChildScheduleRepository extends CrudRepository<ChildSchedule, Long> {
    // Add custom query methods if needed
}
