package com.designpatternsex.examples.factory;

public class CookingRoboFactory extends RoboFactory {

  @Override
  public Robo createRobo(){
    return new CookingRobo();
  }
}