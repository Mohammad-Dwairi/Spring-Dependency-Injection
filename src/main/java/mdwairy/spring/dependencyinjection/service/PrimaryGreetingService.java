package mdwairy.spring.dependencyinjection.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary // Tell Spring that this is the primary implementation of GreetingService interface.
public class PrimaryGreetingService implements GreetingService {

    @Override
    public void sayHello() {
        System.out.println("Hello World --- Primary Greeting Service!\n");
    }
    
}
