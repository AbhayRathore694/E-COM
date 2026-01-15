package com.telusko.SpringEcom.controller;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
//@SpringBootApplication
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String greet(){
        return "Welcome to Telusko";
    }
}
