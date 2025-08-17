
import org.apache.commons.lang3.StringUtils;

public class StringUtilsExample {
    public static boolean isStringEmpty(String str) {
        return StringUtils.isEmpty(str);
    }
    public static void main(String[] args) {
        System.out.println("Testing StringUtils:");
        System.out.println("Empty string: " + isStringEmpty(""));
        System.out.println("Null string: " + isStringEmpty(null));
        System.out.println("Normal string: " + isStringEmpty("Hello"));
        System.out.println("Space string: " + isStringEmpty(" "));
    }
}
