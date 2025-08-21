package org.example;

import org.example.service.GreetingServiceImpl;

public class Main {
    public static void main(String[] args) {
        GreetingServiceImpl service = new GreetingServiceImpl();
        service.greet("");
    }
}