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
}
