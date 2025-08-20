import org.example.MyStrings;
import org.junit.Test;

import static org.junit.Assert.*;

public class MyStringsTest {

    @Test
    public void isEmpty_returnsTrue_forNullAndEmpty() {
        assertTrue(MyStrings.isEmpty(null));   // null -> true
        assertTrue(MyStrings.isEmpty(""));     // ""   -> true
    }

    @Test
    public void isEmpty_returnsFalse_forSpaceAndNonEmpty() {
        assertFalse(MyStrings.isEmpty(" "));    // 空格不算空
        assertFalse(MyStrings.isEmpty("hello"));// 非空
    }
}
