package com.beans.familybusiness.controller;

import com.beans.familybusiness.dto.BenefitDTO;
import com.beans.familybusiness.service.BenefitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/benefits")
public class BenefitsController {

    private final BenefitService benefitService;

    @Autowired
    public BenefitsController(BenefitService benefitService) {
        this.benefitService = benefitService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<BenefitDTO> getBenefitById(@PathVariable Long id) {
        BenefitDTO benefit = benefitService.getBenefitById(id);
        if (benefit != null) {
            return new ResponseEntity<>(benefit, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping
    public List<BenefitDTO> getAllBenefits() {
        return benefitService.getAllBenefits();
    }

    @PostMapping
    public ResponseEntity<BenefitDTO> createBenefit(@RequestBody BenefitDTO benefitDTO) {
        BenefitDTO createdBenefit = benefitService.createBenefit(benefitDTO);
        return new ResponseEntity<>(createdBenefit, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<BenefitDTO> updateBenefit(@PathVariable Long id, @RequestBody BenefitDTO benefitDTO) {
        BenefitDTO updatedBenefit = benefitService.updateBenefit(id, benefitDTO);
        if (updatedBenefit != null) {
            return new ResponseEntity<>(updatedBenefit, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteBenefit(@PathVariable Long id) {
        benefitService.deleteBenefit(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
