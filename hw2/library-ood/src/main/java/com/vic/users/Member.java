package com.vic.users;

public class Member extends User {
    public Member(String username, String password) {
        super(username, password);
    }

    @Override
    public String role() {
        return "Member";
    }
}
