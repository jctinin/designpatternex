package com.designpatternsex.examples.factory;

public abstract class RoboFactory {

  public abstract Robo createRobo();

  public void newRobo() {
    Robo createdRobo = createRobo();
    createdRobo.work();
  }


}