package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StringUtilDemoTest {

    @Test
    void testIsEmptyOrNull() {
        assertTrue(StringUtilDemo.isEmptyOrNull(null));
        assertTrue(StringUtilDemo.isEmptyOrNull(""));
        assertFalse(StringUtilDemo.isEmptyOrNull("hello"));
    }
}
