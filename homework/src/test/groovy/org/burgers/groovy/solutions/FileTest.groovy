package org.burgers.groovy.solutions
import org.burgers.groovy.GroovyHomework
import org.junit.Test

class FileTest extends GroovyHomework {

    @Test
    void how_many_times_does_the_word_OVER_appear(){
        assert (getFile("agileManifesto.txt").text =~ /\s(?i)over\s/).size() == 4
    }

    @Test
    void how_many_characters_are_in_each_file(){
        def count = 0
        getFile("testdir").eachFile {count += it.text.size()}
        assert 210 == count
    }



}
