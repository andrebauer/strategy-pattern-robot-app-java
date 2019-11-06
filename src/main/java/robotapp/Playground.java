package robotapp;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Playground {
  private List<RobotRoute> robotRouteList = new ArrayList<RobotRoute>();
  private Treasure treasure;
  private static final Random random = new Random();
  private static final State initialState = new State(new Point(0,0), Orientation.EAST);

  private Playground() {
    int x = random.nextInt(21) - 10;
    int y = random.nextInt(21) - 10;
    treasure = new Treasure(new Point(x, y));
  }

  private void run() {
    boolean run = true;
    while (run) {
      for (RobotRoute rr : robotRouteList) {
        State s = rr.addMove(rr.robot.doMove(rr.getState()));
        if (s.point.equals(treasure.location)) {
          System.out.printf("Robot %s has found the treasure");
          run = false;
        }
      }
    }
  }

  private void addRobot(Robot robot) {
    RobotRoute rr = new RobotRoute(robot, initialState);
    robotRouteList.add(rr);
  }

  public static void main(String[] args) {
    Robot r2d2 = new Robot("R2D");
    r2d2.setMoveBehaviour(new SpiralBehaviour());
    Playground pg = new Playground();
    pg.addRobot(r2d2);
    pg.run();
     }
}
