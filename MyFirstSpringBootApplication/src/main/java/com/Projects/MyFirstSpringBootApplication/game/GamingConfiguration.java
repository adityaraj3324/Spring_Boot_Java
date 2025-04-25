package com.Projects.MyFirstSpringBootApplication.game;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GamingConfiguration {
	
	@Bean
	public GamingConsole game() {
		var game = new MarioGame();
		return game;
	}
	@Bean
	public GameRunner gamerun(GamingConsole game) {
		
		return new GameRunner(game);
	}
}
