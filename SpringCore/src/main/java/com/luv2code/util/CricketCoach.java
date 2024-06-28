package com.luv2code.util;

import org.springframework.stereotype.Component;

// SpringBean
@Component
public class CricketCoach implements Coach {

    @Override
    public String getDailyWorkOut() {
        return "Practise fast bowling for 15 minutes";
    }
}
