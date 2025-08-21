package oop.src.main.java.org.example;

public class LibrarySystem {
    public static void main(String[] args) {
        // Create books
        RegularBook book1 = new RegularBook("1984", "George Orwell", "ISBN123");
        ReferenceBook book2 = new ReferenceBook("Encyclopedia", "Various", "ISBN456");

        // Display info
        book1.displayInfo();
        book2.displayInfo();

        // Borrow and return RegularBook
        book1.borrowBook("Alice");
        System.out.println("Late Fee (5 days): $" + book1.getLateFee(5));
        book1.returnBook();

        // ReferenceBook late fee
        book2.displayInfo();
        System.out.println("Late Fee (5 days): $" + book2.getLateFee(5));
    }
}