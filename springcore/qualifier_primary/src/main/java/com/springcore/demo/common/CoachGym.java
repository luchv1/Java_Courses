package com.springcore.demo.common;

import org.springframework.stereotype.Component;

@Component
public class CoachGym implements Coach{

    @Override
    public String getDailyWorkout() {
        return "Run 15km !";
    }
    
}
