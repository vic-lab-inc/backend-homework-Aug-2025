package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class StringUtilsDemoTest {

    @Test
    public void testIsEmptyString() {
        assertTrue(StringUtilsDemo.isEmptyString(""));        
        assertTrue(StringUtilsDemo.isEmptyString(null));      
        assertFalse(StringUtilsDemo.isEmptyString("hi"));    
    }


}

