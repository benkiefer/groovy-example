package org.burgers.groovy.example.intro.mocking

import groovy.mock.interceptor.MockFor
import org.junit.Before
import org.junit.Test

class MockForTest {
    ThingOne myThing
    def numberGenerator

    @Before
    public void setup(){
        numberGenerator = new MockFor(NumberGenerator)
        myThing = new ThingOne()
    }

    @Test
    void mockFor_example(){
        numberGenerator.demand.getRandomNumber(){ 4 }

        finalizeSetup()

        assert myThing.plusRandomNumber(2) == 6
    }

    void finalizeSetup(){
        myThing.numberGenerator = numberGenerator.proxyInstance()
    }

}


