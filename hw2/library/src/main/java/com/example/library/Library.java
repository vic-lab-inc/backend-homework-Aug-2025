package com.example.library;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Library {
    private final List<Book> catalog = new ArrayList<>();
    private final List<User> users = new ArrayList<>();

    public void addBook(Book book) {
        catalog.add(book);
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void listUsers() {
        users.forEach(u -> {
            u.displayUserInfo();
            u.showRole();
            System.out.println("----");
        });
    }

    public void listBooks() {
        if (catalog.isEmpty()) {
            System.out.println("No books in the catalog.");
            return;
        }
        System.out.println("Library Catalog:");
        catalog.forEach(book -> {
            book.displayInfo();
            System.out.println("Borrowable: " + (book instanceof Borrowable ? "Yes" : "No"));
            System.out.println("----");
        });
    }

    private Optional<Book> findByIsbn(String isbn) {
        for (Book b : catalog) {
            if (b.getIsbn().equals(isbn)) {
                return Optional.of(b);
            }
        }
        return Optional.empty();
    }

    public void borrow(String isbn, Member borrower) {
        Book b = findByIsbn(isbn)
                .orElseThrow(() -> new IllegalArgumentException("No book with ISBN " + isbn));

        if (b instanceof Borrowable borrowableBook) {
            borrowableBook.borrowBook(borrower);
        } else {
            System.out.println("This book cannot be borrowed.");
        }
    }

    public void returnBook(String isbn) {
        Book b = findByIsbn(isbn)
                .orElseThrow(() -> new IllegalArgumentException("No book with ISBN " + isbn));

        if (b instanceof Borrowable borrowableBook) {
            borrowableBook.returnBook();
        } else {
            System.out.println("This book cannot be returned as it is not borrowed.");
        }
    }

    public void showLateFee(String isbn, int daysLate) {
        Book b = findByIsbn(isbn)
                .orElseThrow(() -> new IllegalArgumentException("No book with ISBN " + isbn));

        double fee = b.getLateFee(daysLate);
        System.out.println("Late fee for " + b.getTitle() + ": $" + fee);
    }
}
