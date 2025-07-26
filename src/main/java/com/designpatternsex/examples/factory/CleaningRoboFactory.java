package com.designpatternsex.examples.factory;

public class CleaningRoboFactory extends RoboFactory {

  @Override
  public Robo createRobo() {
    return new CleaningRobo();
  }
}