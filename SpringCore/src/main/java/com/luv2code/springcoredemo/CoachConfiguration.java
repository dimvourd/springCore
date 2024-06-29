package com.luv2code.springcoredemo;


import com.luv2code.util.Coach;
import com.luv2code.util.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CoachConfiguration {

    // @Bean with the id aquatic instead of swimCoach
    @Bean("aquatic")
    public Coach swimCoach() {
        return new SwimCoach();
    }
}
