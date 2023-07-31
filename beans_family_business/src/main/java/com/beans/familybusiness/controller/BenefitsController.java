package com.beans.familybusiness.controller;

import com.beans.familybusiness.entity.Benefit;
import com.beans.familybusiness.service.BenefitService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/benefits")
public class BenefitsController {

    private final BenefitService benefitService;

    public BenefitsController(BenefitService benefitService) {
        this.benefitService = benefitService;
    }

    @GetMapping("/list")
    public String listBenefits(Model model) {
        List<Benefit> benefits = benefitService.getAllBenefits();
        model.addAttribute("benefits", benefits);
        return "benefits/list";
    }

    @GetMapping("/{id}")
    public String viewBenefit(@PathVariable Long id, Model model) {
        Benefit benefit = benefitService.getBenefitById(id);
        model.addAttribute("benefit", benefit);
        return "benefits/view";
    }

    @GetMapping("/create")
    public String showCreateForm(Model model) {
        model.addAttribute("benefit", new Benefit());
        return "benefits/create";
    }

    @PostMapping("/create")
    public String createBenefit(@ModelAttribute Benefit benefit) {
        benefitService.saveBenefit(benefit);
        return "redirect:/benefits/list";
    }

    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable Long id, Model model) {
        Benefit benefit = benefitService.getBenefitById(id);
        model.addAttribute("benefit", benefit);
        return "benefits/edit";
    }

    @PostMapping("/edit/{id}")
    public String editBenefit(@PathVariable Long id, @ModelAttribute Benefit updatedBenefit) {
        Benefit benefit = benefitService.getBenefitById(id);
        if (benefit != null) {
            benefit.setName(updatedBenefit.getName());
            benefit.setDescription(updatedBenefit.getDescription());
            benefit.setEligibility(updatedBenefit.getEligibility());
            benefit.setApplicationMethod(updatedBenefit.getApplicationMethod());
            benefitService.saveBenefit(benefit);
        }
        return "redirect:/benefits/list";
    }

    @GetMapping("/delete/{id}")
    public String deleteBenefit(@PathVariable Long id) {
        benefitService.deleteBenefitById(id);
        return "redirect:/benefits/list";
    }
}
