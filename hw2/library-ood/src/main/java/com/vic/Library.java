package com.vic;

import com.vic.books.Book;

import java.util.HashMap;
import java.util.Map;

public class Library {
    private final Map<String, Book> books = new HashMap<>();

    public void addBook(Book book) {
        books.put(book.getIsbn(),  book);
    }

    public Book getBook(String isbn) {
        return books.get(isbn);
    }

    public void getBooks() {
        books.values().forEach(Book::displayInfo);
    }
}
