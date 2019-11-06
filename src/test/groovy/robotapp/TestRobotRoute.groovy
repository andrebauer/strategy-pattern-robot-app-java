package robotapp

import spock.lang.Specification

class TestRobotRoute extends Specification {
    def "RobotRoute tracks the moves and getState returns the aggregated state"() {
        given:
        def p = new Point(2, 3)
        def s1 = new State(p, Orientation.SOUTH)
        def r = new Robot("R2D2")
        def rr = new RobotRoute(r, s1)

        when:
        def s1new = rr.addMove(Move.TURN_RIGHT)

        then:
        s1new.equals(rr.getState())
        s1new.point == s1.point
        s1new.orientation == Orientation.WEST
    }
}
