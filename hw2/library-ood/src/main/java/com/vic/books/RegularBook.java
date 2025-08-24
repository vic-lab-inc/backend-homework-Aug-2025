package com.vic.books;

import com.vic.borrow.Borrowable;

public class RegularBook extends Book implements Borrowable {
    private String borrower;

    public RegularBook(String title, String author, String isbn) {
        super(title, author, isbn);
    }

    @Override
    public double getLateFee(int daysLate) {
        return 1.0 * daysLate;
    }

    @Override
    public void borrowBook(String borrower) {
        this.borrower = borrower;
        System.out.println("Borrowing " + borrower);
    }

    @Override
    public void returnBook() {
        System.out.println("Returning " + borrower);
    }

    @Override
    public String getBorrower() {
        return borrower;
    }
}
