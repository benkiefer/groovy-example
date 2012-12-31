package org.burgers.groovy.example.intro.dynamic

import org.junit.Test

class ExpandoTest {

    @Test
    void whats_an_expando(){
        def thing = new Expando()

        thing.name = "expando"
        thing.doSomething = {"Look at me. I can do something!"}

        assert "expando" == thing.name

        println thing.doSomething()
    }

    @Test
    void basically_a_map(){
        def thing = [:]

        thing.name = "expando"
        thing.doSomething = {"Look at me. I can do something!"}

        assert "expando" == thing.name

        println thing.doSomething()
    }

}
