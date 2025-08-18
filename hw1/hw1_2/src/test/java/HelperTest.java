import static org.junit.Assert.*;
import org.junit.Test;

public class HelperTest {
    @Test
    public void testIsEmptyWithNull() {
        assertTrue(Helper.isEmpty(null));
    }

    @Test
    public void testIsEmptyWithEmptyString() {
        assertTrue(Helper.isEmpty(""));
    }

    @Test
    public void testIsEmptyWithWhitespace() {
        assertTrue(Helper.isEmpty("   "));
    }

    @Test
    public void testIsEmptyWithNonEmptyString() {
        assertFalse(Helper.isEmpty("Hello"));
    }

    @Test
    public void testIsEmptyWithStringContainingWhitespaceAndText() {
        assertFalse(Helper.isEmpty("  Hello  "));
    }
}
