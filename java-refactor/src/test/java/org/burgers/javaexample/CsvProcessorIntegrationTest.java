package org.burgers.javaexample;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class CsvProcessorIntegrationTest {
    private CsvProcessor csvProcessor;
    private PersonFactory personFactory;
    private File file;

    @Before
    public void setup() throws IOException {
        csvProcessor = new CsvProcessor();
        personFactory = new PersonFactory();
        csvProcessor.setPersonFactory(personFactory);
        file = File.createTempFile("test", "txt");
    }

    @Test
    public void process() {
        writeToFile("ben,kiefer\njohn,smith");

        List<Person> results = csvProcessor.process(file);

        assertEquals(2, results.size());

        Person ben = results.get(0);

        assertEquals("ben", ben.getFirstName());
        assertEquals("kiefer", ben.getLastName());

        Person john = results.get(1);

        assertEquals("john", john.getFirstName());
        assertEquals("smith", john.getLastName());
    }

    @Test
    public void process_ignore_partials() {
        writeToFile("ben,kiefer\njohn");

        List<Person> results = csvProcessor.process(file);

        assertEquals(1, results.size());
        Person ben = results.get(0);

        assertEquals(ben.getFirstName(), "ben");
        assertEquals(ben.getLastName(), "kiefer");
    }

    private void writeToFile(String text) {
        FileWriter fileWriter;
        BufferedWriter out = null;

        try {
            fileWriter = new FileWriter(file);
            out = new BufferedWriter(fileWriter);
            out.write(text);

        } catch (Exception e) {
            fail("failed writing to file");

        } finally {
            if (out != null) {
                try {
                    out.close();
                } catch (IOException ioe) {
                    fail("failed closing");
                }
            }
        }
    }

    @After
    public void tearDown() {
        file.delete();
    }

}
