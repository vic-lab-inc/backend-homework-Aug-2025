package com.example.library;

public abstract class Book {
    private String title, author, isbn;

    protected Book(String title, String author, String isbn) {
        this.title = title; this.author = author; this.isbn = isbn;
    }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }
    public String getIsbn() { return isbn; }
    public void setIsbn(String isbn) { this.isbn = isbn; }

    public void displayInfo() {
        System.out.printf("Book: %s | Author: %s | ISBN: %s%n", title, author, isbn);
    }

    public abstract double getLateFee(int daysLate);
}
