import org.example.MyStrings;
import org.junit.Test;

import static org.junit.Assert.*;

public class MyStringsTest {

    @Test
    public void isEmpty_returnsTrue_forNullAndEmpty() {
        assertTrue(MyStrings.isEmpty(null));   // null -> true
        assertTrue(MyStrings.isEmpty(""));     // ""   -> true
    }
}
