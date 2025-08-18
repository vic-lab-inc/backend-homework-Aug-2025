package com.example.service;
import com.example.api.GreetingService;

public class GreetingServiceImpl implements GreetingService {
    @Override
    public void greet(String msg) {
        System.out.println("hello world");

    }

    public static void main(String[] args) {
        GreetingService service = new GreetingServiceImpl();
        service.greet("test");
    }
}
