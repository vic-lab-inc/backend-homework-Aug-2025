package com.example.library;

public class RegularBook extends Book implements Borrowable {
    private boolean isBorrowed;
    private Member borrower;

    public RegularBook(String title, String author, String isbn) {
        super(title, author, isbn);
        this.isBorrowed = false;
        this.borrower = null;
    }

    @Override
    public void borrowBook(Member borrower) {
        if (!isBorrowed) {
            this.borrower = borrower;
            isBorrowed = true;
            System.out.println("Book borrowed by: " + borrower.getName());
        } else {
            System.out.println("Book is already borrowed by: " + this.borrower.getName());
        }
    }

    @Override
    public void returnBook() {
        if(!isBorrowed) {
            throw new IllegalStateException("Book is not currently borrowed.");
        }
        System.out.println("Book returned by: " + borrower.getName());
        isBorrowed = false;
        borrower = null;
    }

    @Override
    public double getLateFee(int daysLate) {
        return Math.max(0, daysLate) * 1.0;
    }
}
