package robotapp;

public class Point {

  public final int x, y;

  public Point(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public boolean equals(Point p) {
    return this.x == p.x && this.y == p.y;
  }

  public String toString() {
    return String.format("(%d, %d)", x, y);
  }
}
