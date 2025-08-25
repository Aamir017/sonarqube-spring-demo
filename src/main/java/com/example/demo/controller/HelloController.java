package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class HelloController {

    @GetMapping("/api/hello")
    public String hello() {
        return "Hello from API 👋";
    }

    @GetMapping("/tasks")
    public List<String> tasks() {
        return List.of("Secure CI/CD", "Run SonarQube", "Deploy with Docker");
    }

    // ✅ NO @GetMapping("/") — allows static index.html to load
}
