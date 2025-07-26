package com.designpatternsex.examples.factory;

public abstract class Robo {

  public abstract void work();
}

class CleaningRobo extends Robo {

  @Override
  public void work() {
    System.out.println("Cleaning the house...");
  }
}

class CookingRobo extends Robo {

  @Override
  public void work() {
    System.out.println("Cooking dinner...");
  }
}

