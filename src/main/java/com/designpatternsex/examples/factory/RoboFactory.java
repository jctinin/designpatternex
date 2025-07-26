package com.designpatternsex.examples.factory;

public abstract class RoboFactory {

  // Quando uma subclasse sobrescreve este método, ela o sobrescreve retornando uma instância do Robo
  // do tipo que ela deseja criar. Isso permite que a fábrica crie diferentes tipos de robôs
  // ou seja o método createRobo() passa a retornar um CookingRobo, CleaningRobo ou SpeakingRobo
  // dependendo da subclasse que o implementa.

  public abstract Robo createRobo();

  public void newRobo() {

    // Ou seja: este método createRobo(), já não é mais o createRobo() da superclasse,
    // mas sim o createRobo() da subclasse que o implementa(CookingRoboFactory, CleaningRoboFactory, SpeakingRoboFactory).
    // Isso demonstra o padrão de projeto Factory Method.
    Robo createdRobo = createRobo();


    createdRobo.work();
  }


}