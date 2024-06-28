package com.luv2code.util;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class BasketballCoach implements Coach{

    @Override
    public String getDailyWorkOut() {
        return "play with the ball";
    }
}
