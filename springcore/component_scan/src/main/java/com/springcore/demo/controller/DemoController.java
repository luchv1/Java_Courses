package com.springcore.demo.controller;

import org.springframework.web.bind.annotation.RestController;

import test.utils.Coach;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class DemoController {

    private Coach myCoach;

    public DemoController(Coach theCoach) {
        this.myCoach = theCoach;
    }


    @Value("${coach.name}")
    private String name;

    @Value("${coach.age}")
    private String age;

    @GetMapping("/")
    public String getMethodName() {
        return myCoach.getDailyWorkout();
    }
    
}
