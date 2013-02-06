package org.burgers.javaexample;

import java.util.Arrays;
import java.util.List;

public class PersonFactory {

    public Person build(String line) {
        List<String> values = Arrays.asList(line.split(","));

        if (values.size() == 2) {
            Person person = new Person();
            person.setFirstName(values.get(0));
            person.setLastName(values.get(1));
            return person;
        }

        return null;
    }
}
