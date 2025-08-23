package com.example.library;

public class LibraryApp {
    public static void main(String[] args) {
        RegularBook b1 = new RegularBook("Effective Java", "Joshua Bloch", "9780134685991");
        ReferenceBook b2 = new ReferenceBook("Oxford Dictionary", "OUP", "9780199571123");

        b1.displayInfo();
        b2.displayInfo();

        b1.borrowBook("Alice");
        System.out.println("Late fee for 3 days: $" + b1.getLateFee(3));
        b1.returnBook();

        System.out.println("Reference books cannot be borrowed.");
    }
}
