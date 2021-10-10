package com.buyukli.ivan.sfgdi.controllers;

import com.buyukli.ivan.sfgdi.services.Greeting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
@Qualifier("greeting_2")
public class PropertyInjectedController {

    @Autowired
    @Qualifier("greeting_2")
    private Greeting greeting;

    public String getGreeting() {
        return greeting.sayHello();
    }
}
