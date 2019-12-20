package com.ustglobal.springcore.config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ustglobal.springcore.di.Animal;
import com.ustglobal.springcore.di.Hello;
import com.ustglobal.springcore.di.Pet;

public class AnnotationApp {
public static void main(String[] args) {
	AnnotationConfigApplicationContext applicationContext = 
			new AnnotationConfigApplicationContext(HelloConfigurationClass.class);
	Hello hello = applicationContext.getBean(Hello.class);
	System.out.println(hello.getMsg());
	
	Hello  hello2 = applicationContext.getBean(Hello.class);
	
	System.out.println(hello);
	System.out.println(hello2);
	
	System.out.println("----------------");
	
	//Animal animal = applicationContext.getBean(Animal.class);
	//animal.makeSound();
	
	System.out.println("----------------");
	
	Pet pet = applicationContext.getBean(Pet.class);
	System.out.println(pet.getName());
	pet.getAnimal().makeSound();
	 applicationContext.close();
}
}
