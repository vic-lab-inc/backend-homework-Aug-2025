package org.example;
import org.apache.commons.lang3.StringUtils;
public class Main {
    public static void main(String[] args) {
        String str = "   Hello World   ";
        System.out.println("Trimmed: " + StringUtils.trim(str));
        System.out.println("Is blank? " + StringUtils.isBlank(str));
        System.out.println("Reverse: " + StringUtils.reverse(str));
    }
}