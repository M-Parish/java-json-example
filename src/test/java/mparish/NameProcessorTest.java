package mparish;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NameProcessorTest {
    private transient NameProcessor processor;

    @Test public void testThatNamesAreLastNameCommaFirstName() {
        processor = new NameProcessor("Dave", "Parish");
        assertEquals("Parish, Dave", processor.nameConcatenator() );
    }
    @Test public void testThatNamesAreCapitalized() {
        processor = new NameProcessor("dave", "parish");
        assertEquals("Parish, Dave",processor.nameConcatenator());
    }

}
