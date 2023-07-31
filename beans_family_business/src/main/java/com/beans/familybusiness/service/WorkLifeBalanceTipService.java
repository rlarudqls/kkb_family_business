package com.beans.familybusiness.service;

import com.beans.familybusiness.dto.WorkLifeBalanceTipDTO;
import java.util.List;

public interface WorkLifeBalanceTipService {
    WorkLifeBalanceTipDTO getWorkLifeBalanceTipById(Long id);
    List<WorkLifeBalanceTipDTO> getAllWorkLifeBalanceTips();
    WorkLifeBalanceTipDTO createWorkLifeBalanceTip(WorkLifeBalanceTipDTO workLifeBalanceTipDTO);
    WorkLifeBalanceTipDTO updateWorkLifeBalanceTip(Long id, WorkLifeBalanceTipDTO workLifeBalanceTipDTO);
    void deleteWorkLifeBalanceTip(Long id);
}
