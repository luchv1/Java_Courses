package com.springcore.demo.controller;

import org.springframework.web.bind.annotation.RestController;

import com.springcore.demo.common.Coach;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class DemoController {
    private Coach myCoach;

    @Autowired
    public void setCoach(Coach theCoach) {
        myCoach = theCoach;
    }

    @GetMapping("/")
    public String getMethodName() {
        return myCoach.getDailyWorkout();
    }
}
