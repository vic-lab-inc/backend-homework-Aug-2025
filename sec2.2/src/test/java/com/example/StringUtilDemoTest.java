package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StringUtilDemoTest {

    @Test
    void testIsNullOrEmpty() {
        assertTrue(StringUtilDemo.isNullOrEmpty(null));
        assertTrue(StringUtilDemo.isNullOrEmpty(""));
        assertFalse(StringUtilDemo.isNullOrEmpty(" "));
        assertFalse(StringUtilDemo.isNullOrEmpty("a"));
    }

    @Test
    void testIsNullOrBlank() {
        assertTrue(StringUtilDemo.isNullOrBlank(null));
        assertTrue(StringUtilDemo.isNullOrBlank(""));
        assertTrue(StringUtilDemo.isNullOrBlank("   "));
        assertFalse(StringUtilDemo.isNullOrBlank("a"));
    }
}
