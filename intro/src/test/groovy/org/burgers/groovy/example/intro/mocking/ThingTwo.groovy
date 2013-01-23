package org.burgers.groovy.example.intro.mocking

class ThingTwo {

    JavaNumberGenerator numberGenerator = new JavaNumberGenerator()

    int plusRandomNumber(int number){
        number + numberGenerator.randomNumber()
    }
}