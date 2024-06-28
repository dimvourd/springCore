package com.luv2code.util;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

// SpringBean
@Component
@Lazy
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class CricketCoach implements Coach {
    public CricketCoach() {
        System.out.println("Initialized: "+getClass());
    }

    @Override
    public String getDailyWorkOut() {
        return "Practise fast bowling for 15 minutes";
    }
}
