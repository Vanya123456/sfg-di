package com.buyukli.ivan.sfgdi;

import com.buyukli.ivan.sfgdi.controllers.ConstructorInjectedController;
import com.buyukli.ivan.sfgdi.controllers.MyController;
import com.buyukli.ivan.sfgdi.controllers.PropertyInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SfgDiApplication.class, args);

        MyController controller = context.getBean(MyController.class);

        System.out.println(controller.sayHello());

        ConstructorInjectedController constructorInjectedController = context.getBean(ConstructorInjectedController.class);

        System.out.println(constructorInjectedController.sayHello());

        PropertyInjectedController propertyInjectedController = context.getBean(PropertyInjectedController.class);

        System.out.println(propertyInjectedController.getGreeting());
    }

}
