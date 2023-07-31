package com.beans.familybusiness.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EducationController {

    @GetMapping("/education")
    public String showEducationPage() {
        // TODO: Add logic to retrieve education contents from service and pass them to the view
        return "education"; // Assuming you have an education.html template in the templates folder
    }
}
