package com.example.library;

public class Main {
    public static void main(String[] args) {
        // Create a library instance
        Library lib = new Library();

        // Create a librarian
        Librarian librarian = new Librarian("Lucy", "L001");
        librarian.showRole();
        librarian.displayUserInfo();

        // Create a member
        Member member1 = new Member("Mike", "M001");
        member1.showRole();
        member1.displayUserInfo();

        Member member2 = new Member("Jennifer", "M002");

        // Create a book
        Book book1 = new RegularBook("1984", "George Orwell", "1234567890");
        Book book2 = new RegularBook("To Kill a Mockingbird", "Harper Lee", "0987654321");
        Book book3 = new ReferenceBook("Encyclopedia", "Various", "1122334455");
        // Librarian adds the book to the library
        librarian.addBook(lib, book1);
        librarian.addBook(lib, book2);
        librarian.addBook(lib, book3);

        // List all users
        System.out.println("== Users ==");
        lib.listUsers();

        // List all books
        System.out.println("\n== Catalog ==");
        lib.listBooks();

        // Member borrows the book
        lib.borrow("1234567890", member1); // Successful borrow
        lib.showLateFee("1234567890", 5); // Show late fee for 5 days late
        lib.returnBook("1234567890"); // Return the book

        lib.borrow("1122334455", member2); // Attempt to borrow a reference book

    }
}
