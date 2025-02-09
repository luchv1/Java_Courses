package com.springcore.demo.common;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class GymCoach implements Coach {

    public GymCoach() {
        System.out.println("Constructor " + getClass().getSimpleName());
    }

    @PostConstruct
    public void doSomethingPostConstruct() {
        System.out.println("doSomethingPostConstruct");
    }

    @PreDestroy
    public void doSomethingBeforeDestroy() {
        System.out.println("doSomethingBeforeDestroy");
    }

    @Override
    public String getDailyWorkout() {
        return "Push up 5 reps";
    }
    
}
