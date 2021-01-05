package mdwairy.spring.dependencyinjection.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("ES")
@Service("I18nService")
public class I18nSpanishGreetingService implements GreetingService{

    @Override
    public void sayHello() {
        System.out.println("Hola Mundo --- Spanish Profile");
    }
}
