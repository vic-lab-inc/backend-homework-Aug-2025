package com.example.hw2;

import com.example.hw2.books.ReferenceBook;
import com.example.hw2.books.RegularBook;

public class Main {
    public static void main(String[] args) {
        RegularBook rb = new RegularBook("Effective Java", "Joshua Bloch", "978-0134685991");
        ReferenceBook ref = new ReferenceBook("Oxford English Dictionary", "OUP", "978-0199573158");

        System.out.println("=== Display ===");
        rb.displayInfo();
        ref.displayInfo();

        System.out.println("\n=== Borrow/Return ===");
        rb.borrowBook("mem-100"); // 借出
        rb.displayInfo();
        rb.returnBook();           // 归还
        rb.displayInfo();

        System.out.println("\nLate fee (Regular, 3 days): $" + rb.getLateFee(3));
        System.out.println("Late fee (Reference, 10 days): $" + ref.getLateFee(10));
    }
}
