import com.vic.StringChecks;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class StringChecksTest {
    @Test
    public void testStringChecks_returnTrue() {
        System.out.println("Run test 1");
        assertTrue(StringChecks.isBlank(null));
        assertTrue(StringChecks.isBlank(""));
    }

    @Test
    public void testStringChecks_returnFalse() {
        System.out.println("Run test 2");
        assertFalse(StringChecks.isBlank("a"));
    }
}
