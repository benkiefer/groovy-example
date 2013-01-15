package org.burgers.groovy.homework

import org.junit.Ignore
import org.junit.Test

class ClosureTest {
    @Ignore
    @Test
    void basic_structure_of_closure(){
        def square = {x ->
            // hint: the answer goes here.
        }

        assert 4 == square(2)
    }

    @Ignore
    @Test
    void delegate(){
        def divide = {x, y ->
            divideMe(x, y)
        }

        assert 4 == divide(16, 4)
    }

    class Helper {
        def divideMe(x, y){
            x / y
        }
    }

}
