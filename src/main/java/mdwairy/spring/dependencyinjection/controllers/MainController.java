package mdwairy.spring.dependencyinjection.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import mdwairy.spring.dependencyinjection.service.GreetingService;

@Controller
public class MainController {
    
    private GreetingService greetingService;

    @Autowired // Optional -- Constructor Injection
    // We can omit the @Qualifier here because PrimaryGreetingService bean is annotated as @Primary,
    // which will be the default implementation when not specified.
    public MainController(@Qualifier("primaryGreetingService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public void sayHello() {
        System.out.println("\n----- MainController");
        greetingService.sayHello();
    }
}
