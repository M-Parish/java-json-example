package mparish;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersonTest {
    private transient Person processor;

    @Test public void testThatNamesAreLastNameCommaFirstName() {
        processor = new Person("Dave", "Parish");
        assertEquals("Parish, Dave", processor.fullName() );
    }
    @Test public void testThatNamesAreCapitalized() {
        processor = new Person("dave", "parish");
        assertEquals("Parish, Dave",processor.fullName());
    }

}
