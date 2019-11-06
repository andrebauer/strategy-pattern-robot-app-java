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
}
