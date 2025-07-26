package com.designpatternsex.examples.factory;

public class CleaningRoboFactory extends RoboFactory {

  @Override
  public Robo createRobo() {
    // Este método cria uma instância de CleaningRobo
    // e a retorna.
    // Isso permite que a fábrica crie robôs de limpeza.
    // O método work() será chamado quando newRobo() for invocado.
    // Isso demonstra o padrão de projeto Factory Method.
    // O Factory Method permite que subclasses decidam qual classe instanciar.
    // Neste caso, a fábrica cria um robô de limpeza.
    return new CleaningRobo();
  }
}