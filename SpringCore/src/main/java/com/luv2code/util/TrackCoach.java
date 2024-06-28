package com.luv2code.util;

import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach{

    @Override
    public String getDailyWorkOut() {
        return "run 30mins";
    }
}
