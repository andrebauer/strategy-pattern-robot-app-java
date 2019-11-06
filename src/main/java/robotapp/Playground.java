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
    System.out.printf("The treasure is at point %s\n", treasure.location);
  }

  private void run() {
    boolean run = true;
    while (run) {
      for (RobotRoute rr : robotRouteList) {
        State s = rr.addMove(rr.robot.doMove(rr.getState()));
        if (s.point.equals(treasure.location)) {
          System.out.printf("Robot %s has found the treasure\n", rr.robot);
          System.out.println("The Moves:\n" + rr.toMovesString());
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
    Robot r2d2 = new Robot("R2D2");
    r2d2.setMoveBehaviour(new SpiralBehaviour());
    Robot _3po = new Robot("3PO");
      _3po.setMoveBehaviour(new RandomBehaviour());
    Playground pg = new Playground();
    pg.addRobot(r2d2);
    pg.addRobot(_3po);
    pg.run();
     }
}
