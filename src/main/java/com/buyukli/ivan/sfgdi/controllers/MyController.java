package com.buyukli.ivan.sfgdi.controllers;

import com.buyukli.ivan.sfgdi.services.Greeting;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private Greeting greeting;

    public MyController(@Qualifier("testingProfiles") Greeting greeting) {
        this.greeting = greeting;
    }

    public String sayHello() {
        return greeting.sayHello();
    }
}
