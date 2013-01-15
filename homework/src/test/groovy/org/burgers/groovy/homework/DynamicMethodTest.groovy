package org.burgers.groovy.homework

import org.junit.Test
import org.junit.Ignore
import org.burgers.groovy.GroovyHomework

class DynamicMethodTest extends GroovyHomework {
    @Ignore
    @Test
    void simple_math(){
        assert 1.times(5) == 5
        assert 5.dividedBy(5) == 1
    }

}
