package com.example.demo.controller;

import java.util.Collections;

import java.util.Map;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class GreetController {

    @GetMapping("/greet")
    public Map<String, String> greet() {
        return Collections.singletonMap("message", "Hello from Spring Boot!");
    }

}
