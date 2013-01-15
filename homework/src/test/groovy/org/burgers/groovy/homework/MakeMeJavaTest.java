package org.burgers.groovy.homework;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;
import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;

public class MakeMeJavaTest {

    @Test
    public void words_less_than_three_characters() {
        List<String> results = new ArrayList<String>();
        List<String> words = asList("one", "two", "three", "four", "five");

        for (String word : words) {
            if (word.length() <= 3){
                results.add(word);
            }
        }

        assertEquals(2, results.size());
        assertTrue(results.contains("one"));
        assertTrue(results.contains("two"));
    }



}
