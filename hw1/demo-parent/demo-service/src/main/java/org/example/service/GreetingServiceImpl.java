package org.example.service;


import org.example.api.GreetingService;

public class GreetingServiceImpl implements GreetingService {
    @Override
    public void greet(String msg) {
        System.out.println("hello world " + msg);
    }
}

