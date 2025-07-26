package com.designpatternsex.designpatternex;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.designpatternsex.examples.factory.CleaningRoboFactory;
import com.designpatternsex.examples.factory.CookingRoboFactory;
import com.designpatternsex.examples.factory.RoboFactory;
import com.designpatternsex.examples.factory.SpeakingRoboFactory;

@SpringBootApplication
public class DesignpatternexApplication {

	public static void main(String[] args) {
		SpringApplication.run(DesignpatternexApplication.class, args);
		System.out.println("Design Patterns Example Application Started");
		// Example usage of the Robo factories


		RoboFactory cleaningFactory = new CleaningRoboFactory();
		cleaningFactory.newRobo();

		RoboFactory cookingFactory = new CookingRoboFactory();
		cookingFactory.newRobo();

		RoboFactory speakingFactory = new SpeakingRoboFactory();
		speakingFactory.newRobo();


	}

}
