public class RegularBook extends Book implements Borrowable {

    private String borrower;

    public RegularBook(String title, String author, String isbn) {
        super(title, author, isbn);
        this.borrower = null;
    }

    @Override
    public double getLateFee(int daysLate) {
        return daysLate * 1.0;
    }

    @Override
    public void borrowBook(String borrower) {
        this.borrower = borrower;
    }

    @Override
    public void returnBook() {
        this.borrower = null;
    }
}
