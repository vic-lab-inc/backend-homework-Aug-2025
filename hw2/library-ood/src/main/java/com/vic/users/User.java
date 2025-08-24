package com.vic.users;

public abstract class User {
    private String username;
    private String id;

    protected User(String username, String id) {
        this.username = username;
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public abstract String role();

    public void displayInfo() {
        System.out.println("Username: " + username);
        System.out.println("ID: " + id);
    }
}
