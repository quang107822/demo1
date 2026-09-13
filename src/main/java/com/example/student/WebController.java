package com.example.student;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

    @GetMapping("/students")
    public String showPage() {
        return "students"; // Spring Boot tự tìm file templates/students.html
    }
}