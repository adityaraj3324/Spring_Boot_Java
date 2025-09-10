package com.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfiguration {
		
	@Bean
	Repository repo() {
		Repository r1 = new Repository();
		r1.setPath(12);
		r1.setRepoName("Hello");
		return r1;
	}
}
