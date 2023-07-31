package com.beans.familybusiness.controller;

import com.beans.familybusiness.dto.ChildrenScheduleDTO;
import com.beans.familybusiness.service.ChildrenScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/children-schedules")
public class ChildrenScheduleController {

    private final ChildrenScheduleService childrenScheduleService;

    @Autowired
    public ChildrenScheduleController(ChildrenScheduleService childrenScheduleService) {
        this.childrenScheduleService = childrenScheduleService;
    }

    // 다양한 API 엔드포인트 및 메서드들 구현...

}
