package com.Projects.MyFirstSpringBootApplication.game;

public class GameRunner {

	private GamingConsole game;
	public GameRunner(GamingConsole mario) {
		game = mario;
	}
	public void run() {
		System.out.println("The game is running: "+game);
		game.down();
		game.left();
		game.up();
		game.right();
	}

}
