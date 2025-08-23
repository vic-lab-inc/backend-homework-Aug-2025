package com.example.library;

public interface Borrowable {
    void borrowBook(String borrower);
    void returnBook();
    boolean isBorrowed();
    String getBorrower();
}
