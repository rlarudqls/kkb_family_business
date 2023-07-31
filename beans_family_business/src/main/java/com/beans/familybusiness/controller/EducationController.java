package com.beans.familybusiness.controller;

import com.beans.familybusiness.service.EducationContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EducationController {

    private final EducationContentService educationContentService;

    @Autowired
    public EducationController(EducationContentService educationContentService) {
        this.educationContentService = educationContentService;
    }

    // 컨트롤러에서 educationContentService를 사용하는 메서드 등을 구현...

}
