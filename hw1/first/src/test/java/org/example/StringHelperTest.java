
package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StringHelperTest {

    @Test
    void testIsEmpty() {
        assertTrue(MyStringUtils.isEmpty(null));      // null → true
        assertTrue(MyStringUtils.isEmpty(""));        // 空串 → true
        assertFalse(MyStringUtils.isEmpty("Hello"));  // 非空 → false
    }
}