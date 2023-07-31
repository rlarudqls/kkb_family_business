package com.beans.familybusiness.repository;

import com.beans.familybusiness.entity.Schedule;
import org.springframework.data.repository.CrudRepository;

public interface ScheduleRepository extends CrudRepository<Schedule, Long> {
    // Add custom query methods if needed
}
