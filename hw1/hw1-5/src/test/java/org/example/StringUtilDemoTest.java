package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringUtilDemoTest {
    @Test
    void testIsEmptyOrBlank() {
        assertTrue(StringUtilDemo.isEmptyOrBlank(""));
        assertTrue(StringUtilDemo.isEmptyOrBlank(" "));
        assertFalse(StringUtilDemo.isEmptyOrBlank("a"));
    }


}
