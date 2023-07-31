package com.beans.familybusiness.service;

import com.beans.familybusiness.dto.FamilyScheduleDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FamilyScheduleServiceImpl implements FamilyScheduleService {

    // Temporary list to store FamilyScheduleDTO objects
    private List<FamilyScheduleDTO> familySchedules = new ArrayList<>();

    @Override
    public FamilyScheduleDTO getFamilyScheduleById(Long id) {
        // Find the FamilyScheduleDTO with the provided id in the list
        return familySchedules.stream()
                .filter(schedule -> schedule.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<FamilyScheduleDTO> getAllFamilySchedules() {
        // Return the entire list of FamilyScheduleDTO objects
        return familySchedules;
    }

    @Override
    public FamilyScheduleDTO createFamilySchedule(FamilyScheduleDTO familyScheduleDTO) {
        // Generate a new id (You can use your custom logic here to generate ids)
        Long newId = generateNewId();
        familyScheduleDTO.setId(newId);

        // Add the new FamilyScheduleDTO to the list
        familySchedules.add(familyScheduleDTO);

        // Return the newly created FamilyScheduleDTO
        return familyScheduleDTO;
    }

    @Override
    public FamilyScheduleDTO updateFamilySchedule(Long id, FamilyScheduleDTO familyScheduleDTO) {
        // Find the FamilyScheduleDTO with the provided id in the list
        FamilyScheduleDTO existingSchedule = familySchedules.stream()
                .filter(schedule -> schedule.getId().equals(id))
                .findFirst()
                .orElse(null);

        if (existingSchedule != null) {
            // Update the existing FamilyScheduleDTO with the data from the input FamilyScheduleDTO
            existingSchedule.setTitle(familyScheduleDTO.getTitle());
            existingSchedule.setDescription(familyScheduleDTO.getDescription());
            // Update other fields as needed
            // ...

            // Return the updated FamilyScheduleDTO
            return existingSchedule;
        }

        // Return null if the FamilyScheduleDTO with the provided id was not found
        return null;
    }

    @Override
    public void deleteFamilySchedule(Long id) {
        // Remove the FamilyScheduleDTO with the provided id from the list
        familySchedules.removeIf(schedule -> schedule.getId().equals(id));
    }

    // Generate a new id (Example: Using the current system time)
    private Long generateNewId() {
        return System.currentTimeMillis();
    }
}
