package com.vic.users;

public class Librarian extends User {
    public Librarian(String username, String password) {
        super(username, password);
    }

    @Override
    public String role() {
        return "Librarian";
    }
}
