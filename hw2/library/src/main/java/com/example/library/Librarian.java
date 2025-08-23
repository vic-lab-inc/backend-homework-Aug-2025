package com.example.library;

public class Librarian extends User{
    public Librarian(String name, String userId) {
        super(name, userId);
    }

    @Override
    public void showRole() {
        System.out.println("Role: Librarian");
    }

    public void addBook(Library library, Book book) {
        library.addBook(book);
        System.out.println("Librarian " + getName() + " added book: " + book.getTitle());
        // Logic to add the book to the library's collection
    }
}
