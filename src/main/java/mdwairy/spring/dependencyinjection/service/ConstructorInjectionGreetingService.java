package mdwairy.spring.dependencyinjection.service;

import org.springframework.stereotype.Service;

@Service
public class ConstructorInjectionGreetingService implements GreetingService{

    @Override
    public void sayHello() {

        System.out.println("Hello World --- Constructor Injection Greeting Srevice!\n");
    }
    
}
