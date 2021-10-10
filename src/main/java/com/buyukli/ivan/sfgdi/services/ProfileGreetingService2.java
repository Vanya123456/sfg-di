package com.buyukli.ivan.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("ES")
@Service("testingProfiles")
public class ProfileGreetingService2 implements Greeting{
    @Override
    public String sayHello() {
        return "Hola Mundo - ES";
    }
}
