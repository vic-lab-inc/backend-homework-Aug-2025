package com.example;

public class StringDemo {
    public static void main(String[] args) {
        System.out.println(Strings.isEmptyOrBlank(null));   // true
        System.out.println(Strings.isEmptyOrBlank(""));     // true
        System.out.println(Strings.isEmptyOrBlank("  "));   // true
        System.out.println(Strings.isEmptyOrBlank("abc"));  // false
    }
}