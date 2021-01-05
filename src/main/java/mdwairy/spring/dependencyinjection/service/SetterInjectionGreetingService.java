package mdwairy.spring.dependencyinjection.service;

import org.springframework.stereotype.Service;

@Service
public class SetterInjectionGreetingService implements GreetingService {

    @Override
    public void sayHello() {
        System.out.println("Hello World --- Setter Injection Greeting Service!\n");
    }
    
}
