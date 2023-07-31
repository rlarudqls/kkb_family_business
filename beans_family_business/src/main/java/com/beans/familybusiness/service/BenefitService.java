package com.beans.familybusiness.service;

import com.beans.familybusiness.dto.BenefitDTO;
import java.util.List;

public interface BenefitService {
    BenefitDTO getBenefitById(Long id);
    List<BenefitDTO> getAllBenefits();
    BenefitDTO createBenefit(BenefitDTO benefitDTO);
    BenefitDTO updateBenefit(Long id, BenefitDTO benefitDTO);
    void deleteBenefit(Long id);
}
