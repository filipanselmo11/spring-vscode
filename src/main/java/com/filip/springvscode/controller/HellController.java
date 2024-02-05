package com.filip.springvscode.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class HellController {

    @GetMapping("/")
    public String getMethodName() {
        return "olá mundo vs code";
    }
    
}
