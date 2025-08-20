package org.example.service;

import org.example.api.GreetingService;

public class Main {
    public static void main(String[] args) {
        GreetingService service = new GreetingServiceImpl();
        service.greet("test");
    }
}