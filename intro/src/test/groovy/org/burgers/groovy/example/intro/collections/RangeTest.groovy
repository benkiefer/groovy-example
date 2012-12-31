package org.burgers.groovy.example.intro.collections

import org.junit.Test

class RangeTest {
    @Test
    void simple_range() {
        def result = 0

        (2..5).each {
            result += it
        }

        assert result == 14
    }
}
