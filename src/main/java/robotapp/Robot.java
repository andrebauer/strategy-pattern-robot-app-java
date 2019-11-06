package robotapp;

public class Robot {
  private String name;
  private Behaviour behaviour;

  public Robot(String name) {
    this.name = name;
  }

  public void setMoveBehaviour(Behaviour behaviour) {
    this.behaviour = behaviour;
  }

  public Move doMove(State state) {
    return behaviour.getMove(state);
  }

  public String toString() {
    return this.name;
  }
}
