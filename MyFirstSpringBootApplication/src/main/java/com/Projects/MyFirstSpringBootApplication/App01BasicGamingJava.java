package com.Projects.MyFirstSpringBootApplication;

import com.Projects.MyFirstSpringBootApplication.game.GameRunner;
import com.Projects.MyFirstSpringBootApplication.game.MarioGame;
import com.Projects.MyFirstSpringBootApplication.game.SuperContra;

public class App01BasicGamingJava {
	public static void main(String[] args) {
//		var game = new MarioGame();
		var game = new SuperContra();
		var gameRunner = new GameRunner(game);
		gameRunner.run();
		
		
		
//		Dog d = new Dog();
//		d.sound();
//		Animal d1 = new Dog(); // Upcasting(Reference of Animal and object of Dog)
//		Dog d2 = (Dog)d1;      // Downcasting ---> is like typecasting ---> double a = 2.46; int b = (int)a;
//		d2.sayBye();;
//		
	}

}
//
//class Animal{
//	void eat() {
//		System.out.println("Eating ....");
//	}
//	void sound() {
//		System.out.println("Shouting ....");
//	}
//	void walk() {
//		System.out.println("Walking ....");
//	}
//}
//
//class Dog extends Animal{
//	void sound() {
//		System.out.println("Woof Woof ....");
//	}
//	void sayBye() {
//		System.out.println("GoodBye ....");
//	}
//}
//class Cat extends Animal{}
