package com.beans.familybusiness.service;

import com.beans.familybusiness.dto.FamilyScheduleDTO;
import java.util.List;

public interface FamilyScheduleService {
    FamilyScheduleDTO getFamilyScheduleById(Long id);
    List<FamilyScheduleDTO> getAllFamilySchedules();
    FamilyScheduleDTO createFamilySchedule(FamilyScheduleDTO familyScheduleDTO);
    FamilyScheduleDTO updateFamilySchedule(Long id, FamilyScheduleDTO familyScheduleDTO);
    void deleteFamilySchedule(Long id);
}
