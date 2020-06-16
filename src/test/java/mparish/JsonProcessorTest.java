package mparish;

import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class JsonProcessorTest {
    private transient JsonProcessor processor;

    @Test public void testThatJsonRetirevesData() throws IOException {
        processor = new JsonProcessor();
        assertEquals("Parish, Matt", processor.testMe().fullName());
    }
}
