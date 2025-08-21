package com.mie;

// RegularBook.java
public class RegularBook extends Book {

    public RegularBook(String title, String author, String isbn) {
        super(title, author, isbn);
    }

    @Override
    public double getLateFee(int daysLate) {
        return daysLate * 1.0; // $1 per day
    }
}
