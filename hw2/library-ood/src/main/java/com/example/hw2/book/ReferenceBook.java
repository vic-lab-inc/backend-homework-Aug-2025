package com.example.hw2.books;

public class ReferenceBook extends Book {
    public ReferenceBook(String title, String author, String isbn) {
        super(title, author, isbn);
    }

    @Override
    public double getLateFee(int daysLate) {
        return 0.0; // 参考书不可外借，永远 0
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Type: Reference | Status: In-library use only");
    }
}
