package com.vic;

import com.vic.books.ReferenceBook;
import com.vic.books.RegularBook;
import com.vic.borrow.Borrowable;
import com.vic.users.Member;
import com.vic.users.User;

public class App {
    public static void main(String[] args) {
        User alice = new Member("Alice", "001");
        User bob = new Member("Bob", "002");
        alice.displayInfo();
        bob.displayInfo();

        RegularBook b1 = new RegularBook("Harry Potter", "J. K. Rowling", "abc123");
        ReferenceBook b2 = new ReferenceBook("Head First Java", "Kathy Sierra", "edf456");
        b1.displayInfo();
        b2.displayInfo();

        Library library = new Library();
        library.addBook(b1);
        library.addBook(b2);

        System.out.println("\nAll books:");
        library.getBooks();

        b1.borrowBook(alice.getUsername());
        System.out.println("Borrowed by: " + b1.getBorrower());
        int daysLate = 3;
        System.out.println("Late fee for " + daysLate + " days: $" + b1.getLateFee(daysLate));
        b1.returnBook();
        System.out.println("Returned by: " + b1.getBorrower());

        System.out.println("\nReference book late fee (should be $0): $" + b2.getLateFee(100));
        System.out.println("Done");
    }
}
