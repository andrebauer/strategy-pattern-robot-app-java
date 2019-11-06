package robotapp;

import static robotapp.Orientation.*;

public class State {
  public final Point point;
  public final Orientation orientation;

  public State(Point point, Orientation orientation) {
    this.point = point;
    this.orientation = orientation;
  }

  public boolean equals(State p) {
    return this.orientation == p.orientation && this.point.equals((p.point));
  }

  public State apply(Move m) {
    State s = null;
    Orientation o = null;
    Point p = null;
    switch (m) {
      case TURN_LEFT:
        switch (this.orientation) {
          case SOUTH:
            o = EAST;
            break;
          case NORTH:
            o = WEST;
            break;
          case WEST:
            o = SOUTH;
            break;
          case EAST:
            o = NORTH;
            break;
        }
        s = new State(this.point, o);
        break;
      case TURN_RIGHT:
        switch (this.orientation) {
          case SOUTH:
            o = WEST;
            break;
          case NORTH:
            o = EAST;
            break;
          case WEST:
            o = NORTH;
            break;
          case EAST:
            o = SOUTH;
            break;
        }
        s = new State(this.point, o);
        break;
      case MOVE_FORWARD:
        switch (this.orientation) {
          case SOUTH:
            p = new Point(this.point.x, this.point.y - 1);
            break;
          case NORTH:
            p = new Point(this.point.x, this.point.y + 1);
            break;
          case WEST:
            p = new Point(this.point.x - 1, this.point.y);
            break;
          case EAST:
            p = new Point(this.point.x + 1, this.point.y);
            break;
        }
        s = new State(p, this.orientation);
        break;
    }
    return s;
  }
}
