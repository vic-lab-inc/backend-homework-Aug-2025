package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StringUtilsHelperTest {

    private final StringUtilsHelper helper = new StringUtilsHelper();

    @Test
    void testIsBlank() {
        assertTrue(helper.isBlank(""));
        assertTrue(helper.isBlank("   "));
        assertFalse(helper.isBlank("hello"));
    }

    @Test
    void testCapitalize() {
        assertEquals("Hello", helper.capitalize("hello"));
        assertEquals("Java", helper.capitalize("java"));
        assertEquals("", helper.capitalize(""));
    }
}
