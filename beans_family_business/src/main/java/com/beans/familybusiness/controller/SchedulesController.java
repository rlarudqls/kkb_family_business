package com.beans.familybusiness.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SchedulesController {

    @GetMapping("/schedules")
    public String showSchedulesPage() {
        // TODO: Add logic to retrieve family schedules from service and pass them to the view
        return "schedules"; // Assuming you have a schedules.html template in the templates folder
    }
}
