package com.example.service;

import com.example.api.GreetingService;

public class App {
    public static void main(String[] args) {
        GreetingService service = new GreetingServiceImpl();
        service.greet("anything");
    }
}
