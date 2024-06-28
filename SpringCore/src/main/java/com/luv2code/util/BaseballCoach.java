package com.luv2code.util;

import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach{
    public BaseballCoach() {
        System.out.println("Initialized: "+getClass());
    }

    @Override
    public String getDailyWorkOut() {
        return "Spend 30 mins in batting practise";
    }
}
