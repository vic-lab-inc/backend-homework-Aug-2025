package com.example.library;

public class ReferenceBook extends Book{
    public ReferenceBook(String title, String author, String isbn) {
        super(title, author, isbn);
    }

    @Override
    public double getLateFee(int daysLate) {
        return 0.0; // Reference books do not incur late fees
    }
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("This is a reference book and cannot be checked out.");
    }
}
