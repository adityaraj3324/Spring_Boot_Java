package com.Projects.MyFirstSpringBootApplication.HelloWorldSpring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person(String name, int age, Address address) {};
record Address(String city, String state) {};


@Configuration
public class HelloWorldConfiguration {
	
	@Bean    // define method as a bean
	public String name() {
		return "Aditya";
	}
	
	@Bean
	public int age() {
		return 21;
	}
	@Bean
	public Person human() {
		var person = new Person("Akhil",24,new Address("Jaipur","Rajasthan"));
		return person;
	}
	@Bean
	public Person human2MethodCall() {
		return new Person(name(),age(),pata());
	}
	@Bean
	public Person human3ParaCall(String name, int age, Address address01) {
		return new Person(name,age,address01);
	}
	
	@Bean(name="address01")
	public Address pata() {
		return new Address("Tonk","Rajasthan");
	}
	@Primary
	@Bean
	public Address pata2() {
		return new Address("Delhi","India");
	}

}
