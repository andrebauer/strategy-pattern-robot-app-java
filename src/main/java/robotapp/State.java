package robotapp;

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
}
