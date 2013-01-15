package org.burgers.groovy.solutions

import org.junit.Test

class MakeMeJavaTest {

    @Test
    void words_less_than_three_characters() {
        def words = ["one", "two", "three", "four", "five"]

        assert ["one", "two"] == words.findAll { it.length() <= 3 }
    }
}
