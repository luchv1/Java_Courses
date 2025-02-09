package com.springcore.demo.controller;

import org.springframework.web.bind.annotation.RestController;

import com.springcore.demo.common.Coach;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class DemoController {

    private Coach myCoach;

    @Autowired
    public DemoController(@Qualifier("swimCoach") Coach theCoach) {
        myCoach = theCoach;
    }

    @GetMapping("/")
    public String getMethodName() {
        return myCoach.getDailyWorkout();
    }
}
