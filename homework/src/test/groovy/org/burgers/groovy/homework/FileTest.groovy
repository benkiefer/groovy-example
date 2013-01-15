package org.burgers.groovy.homework

import org.junit.Test
import org.junit.Ignore

class FileTest {

    @Ignore
    @Test
    void how_many_times_does_the_word_OVER_appear(){
        // hint: I messed with case a few times
        // for an extra challenge - do it in one line.
        assert 4 == getFile("agileManifesto.txt")
    }

    @Ignore
    @Test
    void how_many_characters_are_in_each_file_in_the_directory(){
        def count = 0
        File directory = getFile("testDir")

        assert 210 == count
    }


}
