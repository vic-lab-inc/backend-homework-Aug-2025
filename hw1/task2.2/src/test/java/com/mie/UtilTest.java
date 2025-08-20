package com.mie;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UtilTest {
    @Test
    void testIsEmpty() {
        assertTrue(StringUtilDemo.isEmpty(null));
        assertTrue(StringUtilDemo.isEmpty(""));
        assertFalse(StringUtilDemo.isEmpty(" "));
        assertFalse(StringUtilDemo.isEmpty("Hello"));
    }


}
