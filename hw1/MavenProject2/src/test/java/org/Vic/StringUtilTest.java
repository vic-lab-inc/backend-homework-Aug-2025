package org.Vic;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class StringUtilTest {

    @Test
    public void testIsEmpty() {
        assertTrue(StringUtil.isEmpty(""));
        assertTrue(StringUtil.isEmpty(null));
        assertFalse(StringUtil.isEmpty("Hello"));
    }
}
