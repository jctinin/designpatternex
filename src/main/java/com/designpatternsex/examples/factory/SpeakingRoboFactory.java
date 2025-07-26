package com.designpatternsex.examples.factory;

public class SpeakingRoboFactory extends RoboFactory {

  @Override
  public Robo createRobo() {
    return new SpeakingRobo();

  }
}
