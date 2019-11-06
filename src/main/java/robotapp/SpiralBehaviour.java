package robotapp;

public class SpiralBehaviour implements Behaviour {

  public Move getMove(State state) {
    if (state.point.y + 1 == state.point.x && state.orientation == Orientation.EAST)
      return Move.TURN_RIGHT;
    if (state.point.y == -1 * state.point.x
      && (state.orientation == Orientation.NORTH || state.orientation == Orientation.SOUTH))
      return Move.TURN_RIGHT;
    if (state.point.x == state.point.y && state.orientation == Orientation.WEST)
      return Move.TURN_RIGHT;
    return Move.MOVE_FORWARD;
  }
}
