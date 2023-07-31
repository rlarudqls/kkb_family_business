package com.beans.familybusiness.service;

import com.beans.familybusiness.dto.ChildrenScheduleDTO;

import java.util.List;

public interface ChildrenScheduleService {
    ChildrenScheduleDTO getChildrenScheduleById(Long id);
    List<ChildrenScheduleDTO> getAllChildrenSchedules();
    ChildrenScheduleDTO createChildrenSchedule(ChildrenScheduleDTO childrenScheduleDTO);
    ChildrenScheduleDTO updateChildrenSchedule(Long id, ChildrenScheduleDTO childrenScheduleDTO);
    void deleteChildrenSchedule(Long id);
}
