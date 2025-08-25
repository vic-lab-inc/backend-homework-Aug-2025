package com.example.hw2.books;

public abstract class Book {
    // private 字段（封装）
    private String title;
    private String author;
    private String isbn;

    // 构造器
    protected Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    // 具体方法
    public void displayInfo() {
        System.out.printf("Title: %s | Author: %s | ISBN: %s%n", title, author, isbn);
    }

    // 抽象方法：各子类实现自己的逾期费用策略
    public abstract double getLateFee(int daysLate);

    // Getters/Setters
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }

    public String getIsbn() { return isbn; }
    public void setIsbn(String isbn) { this.isbn = isbn; }
}
