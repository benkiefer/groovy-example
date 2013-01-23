package org.burgers.groovy.example.intro.mocking;

import java.util.Random;

public class JavaNumberGenerator {
    public int randomNumber(){
        return new Random().nextInt();
    }
}
