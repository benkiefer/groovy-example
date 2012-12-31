package org.burgers.groovy.example.intro.collections

import org.junit.Test

class SetTest {
    @Test
    void a_set(){
        assert [1, 2] as Set == [1, 2, 1, 2, 1, 2] as Set
    }

}
