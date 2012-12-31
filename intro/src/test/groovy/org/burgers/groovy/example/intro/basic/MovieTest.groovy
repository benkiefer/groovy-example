package org.burgers.groovy.example.intro.basic

import org.junit.Test

import static java.util.Arrays.asList
import static org.junit.Assert.assertEquals
import org.burgers.groovy.example.intro.Movie;

class MovieTest {

    @Test
    void construction_the_java_way(){
        List<String> actors = asList("me", "myself", "i")
        String title = "About Me"

        Movie movie = new Movie()
        movie.setActors(actors)
        movie.setTitle(title)

        assertEquals(movie.getActors(), actors)
        assertEquals(movie.getTitle(), title)
    }

    @Test
    void construction_the_groovy_way(){
        def actors = ["me", "myself", "i"]
        def title = "About Me"

        def movie = new Movie(title: title, actors: actors)

        assert movie.actors == actors
        assert movie.title == title
    }

    @Test
    void construction_with_a_map(){
        def actors = ["me", "myself", "i"]
        def title = "About Me"

        def imTheMap = [title: title, actors: actors]

        def movie = new Movie(imTheMap)

        assert movie.actors == actors
        assert movie.title == title
    }

}
