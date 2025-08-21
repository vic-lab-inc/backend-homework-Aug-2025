package com.example;

import org.apache.commons.lang3.StringUtils;

public class StringUtilDemo {
    // method 1
    public static boolean isNullOrEmpty(String s) {
        return StringUtils.isEmpty(s);
    }
    // method 2
    public static boolean isNullOrBlank(String s) {
        return StringUtils.isBlank(s);
    }
    // method 3
    public static void main(String[] args) {
        System.out.println(isNullOrEmpty(""));     // true
        System.out.println(isNullOrBlank("  "));   // true
        System.out.println(isNullOrEmpty("a"));    // false
    }
}
