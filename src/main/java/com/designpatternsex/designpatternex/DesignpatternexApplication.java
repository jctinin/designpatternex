package com.designpatternsex.designpatternex;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.designpatternsex.examples.adapter.NewRobot;
import com.designpatternsex.examples.adapter.OldRobot;
import com.designpatternsex.examples.adapter.OldRobotImpl;
import com.designpatternsex.examples.adapter.RobotAdapter;
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

		System.out.println("Adapter Pattern Example:");

		OldRobot oldRobot = new OldRobotImpl();
		NewRobot newRobot = new RobotAdapter(oldRobot);
		newRobot.walkAndTalk("North", "Hello, I am a new robot!");


	}

}
