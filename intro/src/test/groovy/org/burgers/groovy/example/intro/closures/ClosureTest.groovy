package org.burgers.groovy.example.intro.closures

import org.junit.Test

class ClosureTest {
    @Test
    void whats_a_closure(){
        def closure = { "Hi Mom" }

        assert "Hi Mom" == closure()
        assert "Hi Mom" == closure.call()
    }

    @Test
    void method_that_takes_a_closure() {
        def thing = new MyThing()

        def result = []

        thing.evens {
            result << it
        }

        assert result == [2]

        result.clear()

        thing.odds {
            result << it
        }

        assert result == [1, 3]
    }

    class MyThing {
        def numbers = [1, 2, 3]

        def odds(Closure c) {
            for (Integer number : numbers) {
                if (number % 2 != 0){
                    c(number)
                }
            }
        }

        def evens(Closure c) {
            for (Integer number : numbers) {
                if (number % 2 == 0){
                    c.call(number)
                }
            }
        }
    }

}
