package com.vic.borrow;

public interface Borrowable {
    void borrowBook(String borrower);

    void returnBook();

    String getBorrower();
}
