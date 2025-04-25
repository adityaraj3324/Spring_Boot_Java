package com.Projects.MyFirstSpringBootApplication.HelloWorldSpring;
import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02SpringHelloWorld {

	public static void main(String[] args) {

		// launch spring context
		var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class); // class as a dependency
		
		// configure the things that we want spring to manage -- configuration class
		
//		System.out.println("=========================================================================");
////		for(String names : context.getBeanDefinitionNames()) {
////			System.out.println(names);
////		}
//		
//		Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out:: println);
//		System.out.println(context.getBeanDefinitionCount());
//		System.out.println("=========================================================================");

		System.out.println(context.getBean("name"));
		System.out.println(context.getBean("age"));
		System.out.println(context.getBean("human"));
	
		System.out.println(context.getBean("address01"));
		System.out.println(context.getBean("human2MethodCall"));
		System.out.println(context.getBean(Address.class));
		System.out.println(context.getBean("pata2"));
		System.out.println(context.getBean("human3ParaCall"));

		context.close();

	}

}
