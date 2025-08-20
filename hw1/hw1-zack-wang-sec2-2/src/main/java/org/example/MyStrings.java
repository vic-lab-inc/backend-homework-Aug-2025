package org.example;

import org.apache.commons.lang3.StringUtils;

public class MyStrings {
    public static  boolean isEmpty(String input) {
        return StringUtils.isEmpty(input);
    }

    public static void main(String[] args) {
        System.out.println(isEmpty(null));
        System.out.println(isEmpty(""));
        System.out.println(isEmpty("hello"));
    }

}
