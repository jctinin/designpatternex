package com.designpatternsex.examples.adapter;

public class RobotAdapter implements NewRobot {

  private OldRobot oldRobot;

  public RobotAdapter(OldRobot oldRobot) {
    this.oldRobot = oldRobot;
  }

  @Override
  public void walkAndTalk(String direction, String phrase) {
    oldRobot.walkFoward(direction);
    System.out.println("Saying: " + phrase);
  }


}
