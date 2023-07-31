package com.beans.familybusiness.service;

import com.beans.familybusiness.entity.Benefit;
import com.beans.familybusiness.repository.BenefitRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BenefitService {

    private final BenefitRepository benefitRepository;

    public BenefitService(BenefitRepository benefitRepository) {
        this.benefitRepository = benefitRepository;
    }

    public List<Benefit> getAllBenefits() {
        return benefitRepository.findAll();
    }

    public Benefit getBenefitById(Long id) {
        return benefitRepository.findById(id).orElse(null);
    }

    public Benefit saveBenefit(Benefit benefit) {
        return benefitRepository.save(benefit);
    }

    public void deleteBenefitById(Long id) {
        benefitRepository.deleteById(id);
    }
}
