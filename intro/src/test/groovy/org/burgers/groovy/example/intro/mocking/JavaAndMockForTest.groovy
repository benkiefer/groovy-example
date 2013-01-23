package org.burgers.groovy.example.intro.mocking
import groovy.mock.interceptor.MockFor
import org.junit.Before
import org.junit.Ignore
import org.junit.Test

class JavaAndMockForTest {
    ThingTwo myThing
    MockFor numberGenerator

    @Before
    public void setup(){
        numberGenerator = new MockFor(JavaNumberGenerator)
        myThing = new ThingTwo()
    }

    @Ignore("can't proxy a java class")
    @Test
    void mockFor_example_with_java(){
        numberGenerator.demand.randomNumber(){ 4 }

        finalizeSetup()

        assert myThing.plusRandomNumber(2) == 6
    }

    void finalizeSetup(){
        myThing.numberGenerator = numberGenerator.proxyInstance()
    }

}


