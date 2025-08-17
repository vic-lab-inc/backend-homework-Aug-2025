import junit.framework.TestCase;

public class StringUtilsExampleTest extends TestCase {

    public void testEmptyString() {
        boolean result = StringUtilsExample.isStringEmpty("");
        assertTrue(result);
    }

    public void testNullString() {
        boolean result = StringUtilsExample.isStringEmpty(null);
        assertTrue(result);
    }

    public void testNormalString() {
        boolean result = StringUtilsExample.isStringEmpty("Hello");
        assertFalse(result);
    }
}