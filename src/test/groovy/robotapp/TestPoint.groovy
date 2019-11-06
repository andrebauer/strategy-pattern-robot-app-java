package robotapp

import spock.lang.Specification

class TestPoint extends Specification {
    def "Point.equals checks if the values for x and y are equal"() {
        given:
        def p = new Point(1, -2)
        def q = new Point(2, 3)
        def r = new Point(1, -2)

        expect:
        !p.equals(q)
        p.equals(r)
        !q.equals(r)
    }
}
