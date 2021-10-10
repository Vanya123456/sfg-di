package com.buyukli.ivan.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("EN")
@Service("testingProfiles")
public class ProfileGreetingService implements Greeting{
    @Override
    public String sayHello() {
        return "Hallo World - EN";
    }
}
