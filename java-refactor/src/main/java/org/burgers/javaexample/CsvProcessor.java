package org.burgers.javaexample;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CsvProcessor {

    private PersonFactory personFactory;

    public List<Person> process(File file) {
        List<Person> people = new ArrayList<Person>();

        BufferedReader br = null;

        try {
            String line;
            br = new BufferedReader(new FileReader(file));

            while ((line = br.readLine()) != null) {
                Person person = personFactory.build(line);
                if (person != null) {
                    people.add(person);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();

        } finally {
            try {
                if (br != null) br.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

        return people;
    }

    public void setPersonFactory(PersonFactory personFactory) {
        this.personFactory = personFactory;
    }

}

