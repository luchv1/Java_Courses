package com.springcore.demo.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class RunCoach implements Coach {

    public RunCoach() {
        System.out.println("Constructor " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Run 15km !";
    }
}
