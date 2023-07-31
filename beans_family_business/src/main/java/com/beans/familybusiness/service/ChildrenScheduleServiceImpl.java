package com.beans.familybusiness.service;

import com.beans.familybusiness.dto.ChildrenScheduleDTO;
import com.beans.familybusiness.entity.ChildrenSchedule;
import com.beans.familybusiness.repository.ChildrenScheduleRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ChildrenScheduleServiceImpl implements ChildrenScheduleService {

    private final ChildrenScheduleRepository childrenScheduleRepository;
    private final ModelMapper modelMapper;

    @Autowired
    public ChildrenScheduleServiceImpl(ChildrenScheduleRepository childrenScheduleRepository, ModelMapper modelMapper) {
        this.childrenScheduleRepository = childrenScheduleRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public ChildrenScheduleDTO getChildrenScheduleById(Long id) {
        ChildrenSchedule childrenSchedule = childrenScheduleRepository.findById(id).orElse(null);
        return (childrenSchedule != null) ? modelMapper.map(childrenSchedule, ChildrenScheduleDTO.class) : null;
    }

    @Override
    public List<ChildrenScheduleDTO> getAllChildrenSchedules() {
        List<ChildrenSchedule> childrenSchedules = childrenScheduleRepository.findAll();
        return childrenSchedules.stream()
                .map(childrenSchedule -> modelMapper.map(childrenSchedule, ChildrenScheduleDTO.class))
                .collect(Collectors.toList());
    }

    @Override
    public ChildrenScheduleDTO createChildrenSchedule(ChildrenScheduleDTO childrenScheduleDTO) {
        ChildrenSchedule childrenSchedule = modelMapper.map(childrenScheduleDTO, ChildrenSchedule.class);
        childrenSchedule.setId(null);
        ChildrenSchedule savedChildrenSchedule = childrenScheduleRepository.save(childrenSchedule);
        return modelMapper.map(savedChildrenSchedule, ChildrenScheduleDTO.class);
    }

    @Override
    public ChildrenScheduleDTO updateChildrenSchedule(Long id, ChildrenScheduleDTO childrenScheduleDTO) {
        ChildrenSchedule existingChildrenSchedule = childrenScheduleRepository.findById(id).orElse(null);
        if (existingChildrenSchedule != null) {
            existingChildrenSchedule.setChildName(childrenScheduleDTO.getChildName());
            existingChildrenSchedule.setEndDate(childrenScheduleDTO.getEndDate());
            // 다른 필드도 필요에 따라 업데이트하세요.
            ChildrenSchedule updatedChildrenSchedule = childrenScheduleRepository.save(existingChildrenSchedule);
            return modelMapper.map(updatedChildrenSchedule, ChildrenScheduleDTO.class);
        }
        return null;
    }

    @Override
    public void deleteChildrenSchedule(Long id) {
        childrenScheduleRepository.deleteById(id);
    }
}
