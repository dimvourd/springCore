package com.luv2code.util;

public class SwimCoach implements Coach{

    public SwimCoach(){
        System.out.println("Initialized: "+ getClass());
    }
    @Override
    public String getDailyWorkOut() {
        return "Swim for 40 minutes.";
    }
}
