package com.example.hw2.books;

import com.example.hw2.core.Borrowable;

public class RegularBook extends Book implements Borrowable {
    private boolean checkedOut = false;
    private String currentBorrower = null;

    public RegularBook(String title, String author, String isbn) {
        super(title, author, isbn);
    }

    @Override
    public double getLateFee(int daysLate) {
        return daysLate <= 0 ? 0.0 : 1.0 * daysLate; // $1/day
    }

    @Override
    public void borrowBook(String borrower) {
        if (checkedOut) throw new IllegalStateException("Already checked out by " + currentBorrower);
        checkedOut = true;
        currentBorrower = borrower;
    }

    @Override
    public void returnBook() {
        if (!checkedOut) throw new IllegalStateException("Not checked out.");
        checkedOut = false;
        currentBorrower = null;
    }

    public boolean isCheckedOut() { return checkedOut; }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Type: Regular | Status: " + (checkedOut ? "Checked out" : "Available"));
    }
}
