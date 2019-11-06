package robotapp;

import java.util.Random;

public class RandomBehaviour implements Behaviour {

  private static final Random random = new Random();
  private static final Move[] values = Move.values();

  @Override
  public Move getMove(State state) {
    return values[random.nextInt(values.length)];
  }
}
