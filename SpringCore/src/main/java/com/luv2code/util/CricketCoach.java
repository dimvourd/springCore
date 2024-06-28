package com.luv2code.util;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

// SpringBean
@Component
@Lazy
public class CricketCoach implements Coach {
    public CricketCoach() {
        System.out.println("Initialized: "+getClass());
    }

    @Override
    public String getDailyWorkOut() {
        return "Practise fast bowling for 15 minutes";
    }
}
