package mdwairy.spring.dependencyinjection.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("EN")
@Service("I18nService")
public class I18nEnglishGreetingService implements GreetingService {

    @Override
    public void sayHello() {
        System.out.println("Hello World --- English Profile");
    }
    
}
