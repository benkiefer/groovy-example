package org.burgers.groovy.example.intro.mocking

class NumberGenerator {

    int getRandomNumber(){
        new Random().nextInt()
    }

}
