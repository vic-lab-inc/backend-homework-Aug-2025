package com.example.library;

public class RegularBook extends Book implements Borrowable {
    private boolean borrowed;
    private String borrower;

    public RegularBook(String title, String author, String isbn) {
        super(title, author, isbn);
    }

    @Override public void borrowBook(String borrower) {
        if (borrowed) throw new IllegalStateException("Already borrowed by " + this.borrower);
        borrowed = true; this.borrower = borrower;
        System.out.printf("Borrowed \"%s\" by %s%n", getTitle(), borrower);
    }

    @Override public void returnBook() {
        if (!borrowed) throw new IllegalStateException("Not borrowed");
        System.out.printf("Returned \"%s\" by %s%n", getTitle(), borrower);
        borrowed = false; borrower = null;
    }

    @Override public boolean isBorrowed() { return borrowed; }
    @Override public String getBorrower() { return borrower; }

    @Override public double getLateFee(int daysLate) {
        return Math.max(0, daysLate) * 1.0; // $1/day
    }
}
