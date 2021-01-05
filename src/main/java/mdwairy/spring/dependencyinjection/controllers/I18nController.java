package mdwairy.spring.dependencyinjection.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import mdwairy.spring.dependencyinjection.service.GreetingService;

@Controller
public class I18nController {
    
    @Autowired
    @Qualifier("I18nService")
    private GreetingService greetingService;

    public void sayHello() {
        System.out.println("----- I18nController");
        greetingService.sayHello();
    }
}
