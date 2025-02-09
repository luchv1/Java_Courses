package com.springcore.demo.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class RunCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Run 15km !";
    }
}
