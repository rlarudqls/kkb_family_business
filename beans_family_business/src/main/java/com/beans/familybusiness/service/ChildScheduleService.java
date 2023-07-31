package com.beans.familybusiness.service;

import com.beans.familybusiness.entity.ChildSchedule;
import com.beans.familybusiness.repository.ChildScheduleRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChildScheduleService {

    private final ChildScheduleRepository childScheduleRepository;

    public ChildScheduleService(ChildScheduleRepository childScheduleRepository) {
        this.childScheduleRepository = childScheduleRepository;
    }

    public List<ChildSchedule> getAllChildSchedules() {
        return (List<ChildSchedule>) childScheduleRepository.findAll();
    }

    public ChildSchedule getChildScheduleById(Long id) {
        return childScheduleRepository.findById(id).orElse(null);
    }

    public ChildSchedule saveChildSchedule(ChildSchedule childSchedule) {
        return childScheduleRepository.save(childSchedule);
    }

    public void deleteChildScheduleById(Long id) {
        childScheduleRepository.deleteById(id);
    }
}
