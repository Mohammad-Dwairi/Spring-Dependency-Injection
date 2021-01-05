package mdwairy.spring.dependencyinjection.service;

import org.springframework.stereotype.Service;

@Service
public class PropertyInjectionGreetingService implements GreetingService{

    @Override
    public void sayHello() {
        System.out.println("Hello World --- Property Injection Greeting Service!\n");
    }
    
}
