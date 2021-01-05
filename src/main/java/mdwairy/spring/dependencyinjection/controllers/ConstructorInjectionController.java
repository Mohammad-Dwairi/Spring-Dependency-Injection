package mdwairy.spring.dependencyinjection.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import mdwairy.spring.dependencyinjection.service.GreetingService;

@Controller
public class ConstructorInjectionController {
    private GreetingService greetingService;

    @Autowired // Optional on Constructor Injection
    // @Qualifier annatation specifies which service implementation to inject when we have multiple implementation of the interface.
    public ConstructorInjectionController(@Qualifier("constructorInjectionGreetingService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public void sayHello() {
        System.out.println("----- ConstructorInjectionController");
        greetingService.sayHello();
    }
}
