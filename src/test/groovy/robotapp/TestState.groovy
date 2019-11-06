package robotapp

import spock.lang.Specification

class TestState extends Specification {

    def "equals checks if both point.equals holds and the orientation is equal"() {
        given:
        def p = new Point(3, -4)
        def q = new Point(2, 3)
        def r = new Point(3, -4)
        def s1 = new State(p, Orientation.SOUTH)
        def s2 = new State(q, Orientation.SOUTH)
        def s3 = new State(r, Orientation.NORTH)
        def s4 = new State(r, Orientation.SOUTH)
        def s5 = new State(q, Orientation.WEST)
        def s6 = new State(p, Orientation.EAST)

        expect:
        s1.equals(s1)
        !s1.equals(s2)
        !s1.equals(s3)
        s1.equals(s4)
        !s1.equals(s5)
        !s1.equals(s6)
        s2.equals(s2)
        !s2.equals(s3)
        !s2.equals(s4)
        !s2.equals(s5)
        !s2.equals(s6)
        s3.equals(s3)
        !s3.equals(s4)
        !s3.equals(s5)
        !s3.equals(s6)
        s4.equals(s4)
        !s4.equals(s5)
        !s4.equals(s6)
        s5.equals(s5)
        !s5.equals(s6)
        s6.equals(s6)
    }
}
