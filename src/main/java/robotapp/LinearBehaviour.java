package robotapp;

public class LinearBehaviour implements Behaviour {

  public Move getMove(State state) {
    return Move.MOVE_FORWARD;
  }
}
