package com.example.library;

public class Member extends User{
    public Member(String name, String userId) {
        super(name, userId);
    }
    @Override
    public void showRole() {
        System.out.println("Role: Member");
    }
}
