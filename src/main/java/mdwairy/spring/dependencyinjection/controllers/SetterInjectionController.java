package mdwairy.spring.dependencyinjection.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import mdwairy.spring.dependencyinjection.service.GreetingService;

@Controller
public class SetterInjectionController {
    
    private GreetingService greetingService;

    @Autowired
    public void setSetterInjectionGreetingService(@Qualifier("setterInjectionGreetingService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public void sayHello() {
        System.out.println("----- SetterInjectionController");
        greetingService.sayHello();
    }
    
}
