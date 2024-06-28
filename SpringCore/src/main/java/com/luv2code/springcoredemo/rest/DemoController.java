package com.luv2code.springcoredemo.rest;

import com.luv2code.util.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DemoController {


    private Coach myCoach;

    // Autowired is like @Inject
//    @Autowired
    DemoController(Coach coach){
        this.myCoach = coach;
    }

    @GetMapping("/getDailyWorkout")
    public String getDailyWorkOut() {
        return myCoach.getDailyWorkOut();
    }

    // setter Injection
    @Autowired
    public void setMyCoach(Coach myCoach) {
        this.myCoach = myCoach;
    }
}
