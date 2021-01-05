package mdwairy.spring.dependencyinjection.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import mdwairy.spring.dependencyinjection.service.GreetingService;

@Controller
public class PropertyInjectionController {
    
    @Qualifier("propertyInjectionGreetingService")
    @Autowired // Not Optional, Not Recommended
    private GreetingService greetingService;

    public void sayHello() {
        System.out.println("----- PropertyInjectionController");
        greetingService.sayHello();
    }
}
