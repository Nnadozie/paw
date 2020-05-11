package com.paawww.paw.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/hello")
public class helloController {

    @GetMapping
    public String hello() {
        return "Hello";
    }
} 