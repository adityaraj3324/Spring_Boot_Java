package com.app.springannotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		
	AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext();
	
	ac.scan("com.app.springannotation");
	
	ac.refresh();
	
	HandlerComponent hc = ac.getBean("ace",HandlerComponent.class);
	
	System.out.println(hc);
	}
}
