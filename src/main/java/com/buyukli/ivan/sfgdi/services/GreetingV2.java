package com.buyukli.ivan.sfgdi.services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("greeting_2")
public class GreetingV2 implements Greeting{
    @Override
    public String sayHello() {
        return "Hallo World 2!";
    }
}
