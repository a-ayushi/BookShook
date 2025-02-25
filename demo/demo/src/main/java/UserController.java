package com.example.demo.controller;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/api")
public calss UserController{
    @getMapping("/hello")
    public String sayHello(){
        return "Hello,Welcome to java API";
    }
}