package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StringsTest {
    @Test
    void testIsEmptyOrBlank() {
        assertTrue(Strings.isEmptyOrBlank(null));
        assertTrue(Strings.isEmptyOrBlank(""));
        assertTrue(Strings.isEmptyOrBlank("   "));
        assertFalse(Strings.isEmptyOrBlank("abc"));
    }
}
