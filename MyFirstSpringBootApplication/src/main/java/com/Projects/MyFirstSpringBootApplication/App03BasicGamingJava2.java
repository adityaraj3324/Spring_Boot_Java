package com.Projects.MyFirstSpringBootApplication;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.Projects.MyFirstSpringBootApplication.game.GameRunner;
import com.Projects.MyFirstSpringBootApplication.game.GamingConfiguration;
import com.Projects.MyFirstSpringBootApplication.game.GamingConsole;
import com.Projects.MyFirstSpringBootApplication.game.MarioGame;
import com.Projects.MyFirstSpringBootApplication.game.SuperContra;

public class App03BasicGamingJava2 {
	public static void main(String[] args) {
		
		var context = new AnnotationConfigApplicationContext(GamingConfiguration.class);

		context.getBean(GamingConsole.class).down();
		context.getBean(GameRunner.class).run();
		context.close();
	}

}