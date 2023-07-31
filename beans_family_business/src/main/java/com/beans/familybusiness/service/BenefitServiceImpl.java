package com.beans.familybusiness.service;

import com.beans.familybusiness.dto.BenefitDTO;
import com.beans.familybusiness.entity.Benefit;
import com.beans.familybusiness.repository.BenefitRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BenefitServiceImpl implements BenefitService {

    private final BenefitRepository benefitRepository;
    private final ModelMapper modelMapper;

    @Autowired
    public BenefitServiceImpl(BenefitRepository benefitRepository, ModelMapper modelMapper) {
        this.benefitRepository = benefitRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public BenefitDTO getBenefitById(Long id) {
        Benefit benefit = benefitRepository.findById(id).orElse(null);
        return (benefit != null) ? modelMapper.map(benefit, BenefitDTO.class) : null;
    }

    @Override
    public List<BenefitDTO> getAllBenefits() {
        List<Benefit> benefits = benefitRepository.findAll();
        return benefits.stream()
                .map(benefit -> modelMapper.map(benefit, BenefitDTO.class))
                .collect(Collectors.toList());
    }

    @Override
    public BenefitDTO createBenefit(BenefitDTO benefitDTO) {
        Benefit benefit = modelMapper.map(benefitDTO, Benefit.class);
        benefit.setId(null);
        Benefit savedBenefit = benefitRepository.save(benefit);
        return modelMapper.map(savedBenefit, BenefitDTO.class);
    }

    @Override
    public BenefitDTO updateBenefit(Long id, BenefitDTO benefitDTO) {
        Benefit existingBenefit = benefitRepository.findById(id).orElse(null);
        if (existingBenefit != null) {
            existingBenefit.setName(benefitDTO.getName());
            existingBenefit.setDescription(benefitDTO.getDescription());
            existingBenefit.setEligibility(benefitDTO.getEligibility());
            existingBenefit.setApplicationMethod(benefitDTO.getApplicationMethod());
            Benefit updatedBenefit = benefitRepository.save(existingBenefit);
            return modelMapper.map(updatedBenefit, BenefitDTO.class);
        }
        return null;
    }

    @Override
    public void deleteBenefit(Long id) {
        benefitRepository.deleteById(id);
    }
}
