package com.springcore.demo.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class GymCoach implements Coach {

    public GymCoach() {
        System.out.println("Constructor " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Push up 5 reps";
    }
    
}
