package com.example.service;

public class Application {
    public static void main(String[] args) {
        GreetingServiceImpl svc = new GreetingServiceImpl();
        svc.greet("ignored");
    }
}
