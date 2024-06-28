package com.luv2code.util;

import org.springframework.stereotype.Component;

@Component
public class BasketballCoach implements Coach{

    @Override
    public String getDailyWorkOut() {
        return "play with the ball";
    }
}
