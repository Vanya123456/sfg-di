package com.buyukli.ivan.sfgdi.services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("greeting_1")
public class GreetingImpl implements Greeting {
    @Override
    public String sayHello() {
        return "Hello World";
    }
}
