package org.burgers.groovy.solutions

import org.junit.Test

class ClosureTest {
    @Test
    void basic_structure_of_closure() {
        def square = { x ->
            x * x
        }

        assert 4 == square(2)
    }

    @Test
    void delegate() {
        def divide = { x, y ->
            divideMe(x, y)
        }

        divide.delegate = new Helper()
        assert 4 == divide(16, 4)
    }

    class Helper {
        def divideMe(x, y) {
            x / y
        }
    }


}
