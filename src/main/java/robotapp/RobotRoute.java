package robotapp;

import java.util.LinkedList;
import java.util.List;

public class RobotRoute {

  public final Robot robot;
  public final State initialState;
  public final List<Move> moves = new LinkedList<Move>();

  public RobotRoute(Robot robot, State initialState) {
    this.robot = robot;
    this.initialState = initialState;
  }

  public State addMove(Move move) {
    moves.add(move);
    return getState();
  }

  public State getState() {
    State s = initialState;
    for (Move m: moves) {
      s = s.apply(m);
    }
    return s;
  }

  public String toMovesString() {
    StringBuilder sb = new StringBuilder();
    for (Move m: moves) {
      sb.append(m + ", ");
    }
    return sb.toString();
  }
}
