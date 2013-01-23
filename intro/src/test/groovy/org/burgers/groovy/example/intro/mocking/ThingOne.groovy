package org.burgers.groovy.example.intro.mocking

class ThingOne {

    NumberGenerator numberGenerator = new NumberGenerator()

    int plusRandomNumber(int number){
        number + numberGenerator.getRandomNumber()
    }
}