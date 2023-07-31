package com.beans.familybusiness.controller;

import com.beans.familybusiness.service.FamilyScheduleService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ScheduleController {

    private final FamilyScheduleService familyScheduleService;

    public ScheduleController(FamilyScheduleService familyScheduleService) {
        this.familyScheduleService = familyScheduleService;
    }

    // 컨트롤러의 나머지 내용 생략...
}
