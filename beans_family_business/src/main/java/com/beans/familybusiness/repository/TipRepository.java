package com.beans.familybusiness.repository;

import com.beans.familybusiness.entity.Tip;
import org.springframework.data.repository.CrudRepository;

public interface TipRepository extends CrudRepository<Tip, Long> {
    // Add custom query methods if needed
}
