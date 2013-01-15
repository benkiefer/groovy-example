package org.burgers.groovy.solutions

import org.burgers.groovy.GroovyHomework
import org.junit.Test

class DynamicMethodTest extends GroovyHomework {
    @Test
    public void simple_math(){
        Integer.metaClass.times = { Integer i ->
            delegate * i
        }

        Integer.metaClass.dividedBy = { Integer i ->
            delegate / i
        }

        assert 1.times(5) == 5
        assert 5.dividedBy(5) == 1
    }

}
