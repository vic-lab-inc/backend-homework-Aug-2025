package org.example;
import org.apache.commons.lang3.StringUtils;

public class StringUtilDemo {
    public static boolean isEmptyOrBlank(String input) {
        return StringUtils.isBlank(input);
    }
    public static void main(String[] args) {
        System.out.println(isEmptyOrBlank(""));
        System.out.println(isEmptyOrBlank(" "));
        System.out.println(isEmptyOrBlank("a"));
    }
}
