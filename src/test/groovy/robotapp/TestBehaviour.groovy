package robotapp

import spock.lang.Specification

class TestBehaviour extends Specification {
    def "linearBehaviour returns MOVE_FORWARD"() {
        given:
        def p = new Point(5, -7)
        def s = new State(p, Orientation.WEST)
        def lb = new LinearBehaviour()

        expect:
        lb.getMove(s) == Move.MOVE_FORWARD
    }

    def "spiralBehaviour circles around the point P(0|0)"() {
        given:
        def q = new Point(2, -2)
        def p = new Point(1, -2)
        def s1 = new State(q, Orientation.SOUTH)
        def s2 = new State(q, Orientation.WEST)
        def s3 = new State(p, Orientation.WEST)
        def sb = new SpiralBehaviour()

        expect:
        sb.getMove(s1) == Move.TURN_RIGHT
        sb.getMove(s2) == Move.MOVE_FORWARD
        sb.getMove(s3) == Move.MOVE_FORWARD
    }
}
