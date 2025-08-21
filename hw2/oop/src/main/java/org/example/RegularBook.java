package oop.src.main.java.org.example;

class RegularBook extends Book implements Borrowable {
    private boolean isBorrowed = false;
    private String borrower;

    public RegularBook(String title, String author, String isbn) {
        super(title, author, isbn);
    }

    @Override
    public double getLateFee(int daysLate) {
        return daysLate * 1.0; // $1 per day
    }

    @Override
    public void borrowBook(String borrower) {
        if (!isBorrowed) {
            this.isBorrowed = true;
            this.borrower = borrower;
            System.out.println(getTitle() + " borrowed by " + borrower);
        } else {
            System.out.println(getTitle() + " is already borrowed.");
        }
    }

    @Override
    public void returnBook() {
        if (isBorrowed) {
            System.out.println(getTitle() + " returned by " + borrower);
            this.isBorrowed = false;
            this.borrower = null;
        } else {
            System.out.println(getTitle() + " was not borrowed.");
        }
    }
}
