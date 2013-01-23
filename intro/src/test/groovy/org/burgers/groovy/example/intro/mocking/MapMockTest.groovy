package org.burgers.groovy.example.intro.mocking

import org.junit.Before
import org.junit.Test

class MapMockTest {
    ThingOne myThing
    def numberGenerator

    @Before
    public void setup(){
        myThing = new ThingOne()
    }

    @Test
    void mockFor_example(){
        numberGenerator = [getRandomNumber:{
            4
        }]

        finalizeSetup()
        assert myThing.plusRandomNumber(2) == 6
    }

    void finalizeSetup(){
        myThing.numberGenerator = numberGenerator as NumberGenerator
    }

}
