package com.revature.spring_beans;

import com.revature.models.Owner;
import com.revature.models.Pet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringBeansApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBeansApplication.class, args);

		// based on Application Context XML.
		//ApplicationContext appCtx = new ClassPathXmlApplicationContext("appContext.xml");


		// Annotation Driven
		ApplicationContext appCtx = new ClassPathXmlApplicationContext("appContextAnnotationDriven.xml");

		Owner owner = appCtx.getBean(Owner.class);
		System.out.println(owner);

		Pet pet = appCtx.getBean(Pet.class);

		System.out.println(pet);


	}

}
