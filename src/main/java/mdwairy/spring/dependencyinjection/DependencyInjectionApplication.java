package mdwairy.spring.dependencyinjection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import mdwairy.spring.dependencyinjection.controllers.ConstructorInjectionController;
import mdwairy.spring.dependencyinjection.controllers.I18nController;
import mdwairy.spring.dependencyinjection.controllers.MainController;
import mdwairy.spring.dependencyinjection.controllers.PropertyInjectionController;
import mdwairy.spring.dependencyinjection.controllers.SetterInjectionController;

@SpringBootApplication
public class DependencyInjectionApplication {

	public static void main(String[] args) {

		// Getting the application context
		// The Wrapper or container that will wrap all spring beans to be used or injected during the application life cycle.
		ApplicationContext ctx = SpringApplication.run(DependencyInjectionApplication.class, args);

		// MainController is annotated by @Controller annotation, which inherts from @Component.
		// This annotation will tell spring to register this bean in the Spring container (IoC).
		MainController mainController = (MainController) ctx.getBean("mainController");
		mainController.sayHello();
		
		// These Three DI methods in Spring
		// Three Classes implements the same GreetingSrevice Interface.
		// Spring IoC can distinguish between them by annotating the injected dependency by @Qaulifier("dependecnyName")
		// If @Qualifier is not specified, The Bean with @Primary will be the default implementation.
		ConstructorInjectionController constructorInjectionController = (ConstructorInjectionController) ctx.getBean("constructorInjectionController");
		constructorInjectionController.sayHello();

		PropertyInjectionController propertyInjectionController = (PropertyInjectionController) ctx.getBean("propertyInjectionController");
		propertyInjectionController.sayHello();

		SetterInjectionController setterInjectionController = (SetterInjectionController) ctx.getBean("setterInjectionController");
		setterInjectionController.sayHello();

		// Applying Spring Profiles with @Profile
		// Enables you to inject different dependencies with different runtimes.
		// The i18nController injected with a dependency that have two implementations
		// but when we register an active profile, the implementation with the active profile will be injected
		// (see application.properties in resources and each implementation @Profile),
		// other profiles will be ignored.
		// if the active profile is the ( EN ) profile, the I18nEnglishGreetingService will be injected in the I18nController.
		// if the active profile is the ( ES ) profile, the I18nSpanishGreetingService will be injected in the I18nController.
		I18nController i18nController = (I18nController) ctx.getBean("i18nController");
		i18nController.sayHello();
	}

}
