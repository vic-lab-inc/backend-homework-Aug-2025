package com.example.library;

public abstract class User {
    private String name;
    private String userId;

    public User(String name, String userId) {
        this.name = name;
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void displayUserInfo() {
        System.out.println(getClass().getSimpleName()
                + " — Name: " + name
                + ", UserID: " + userId);
    };
    public abstract void showRole();
}
