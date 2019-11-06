package robotapp;

public class State {
  public final Point point;
  public final Orientation orientation;

  public State(Point point, Orientation orientation) {
    this.point = point;
    this.orientation = orientation;
  }
}
