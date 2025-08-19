package org.Vic;

import org.apache.commons.lang3.StringUtils;

public class StringUtil {
    public static  boolean isEmpty(String input) {
        return StringUtils.isEmpty(input);
    }

    public static void main(String[] args) {
        System.out.println(isEmpty(""));
        System.out.println(isEmpty("Hello World"));
    }
}
