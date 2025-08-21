package com.mie;

// ReferenceBook.java
public class ReferenceBook extends Book {

    public ReferenceBook(String title, String author, String isbn) {
        super(title, author, isbn);
    }

    @Override
    public double getLateFee(int daysLate) {
        return 0.0; // Reference books cannot be checked out
    }
}
