package com.example.aasrepo.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("test")
    public String get(){
        return "HELLO ANDI!";
    }
}
