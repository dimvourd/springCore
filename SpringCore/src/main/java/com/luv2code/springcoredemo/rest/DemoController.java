package com.luv2code.springcoredemo.rest;

import com.luv2code.util.Coach;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DemoController {

    // Field Injection
    // @Autowired
    private Coach myCoach;
    private Coach anotherCoach;


    // define the init method
    @PostConstruct
    public void init(){
        System.out.println("Start up stuff.");
    }

    // difine the destruct method
    @PreDestroy
    public void destroy(){
        System.out.println("Do my clean up stuff.");
    }

    // Autowired is like @Inject
    @Autowired
    DemoController(@Qualifier("aquatic")Coach coach){
        this.myCoach = coach;
    }

    @GetMapping("/dailyWorkout")
    public String getDailyWorkOut() {
        return myCoach.getDailyWorkOut();
    }

    // setter Injection
//    @Autowired
//    public void setMyCoach(@Qualifier("cricketCoach") Coach myCoach,
//                           @Qualifier("cricketCoach") Coach anotherCoach) {
//        System.out.println(myCoach.getClass());
//        this.myCoach = myCoach;
//        this.anotherCoach = anotherCoach;
//    }

    // setter Injection without name setter
//    @Autowired
//    public void doSomeStuff(Coach myCoach){
//        System.out.println(myCoach);
//        this.myCoach = myCoach;
//    }

    @GetMapping("/check")
    public String check(){
        System.out.println("check");
        return "myCoach == anotherCoach : " + (myCoach == anotherCoach);
    }
}
