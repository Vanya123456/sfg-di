package com.buyukli.ivan.sfgdi.controllers;

import com.buyukli.ivan.sfgdi.services.Greeting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {

    private final Greeting greeting;

    public ConstructorInjectedController(@Qualifier("greeting_1") Greeting greeting) {
        this.greeting = greeting;
    }

    public String sayHello() {
        return greeting.sayHello();
    }
}
