package com.example.service;

import com.example.api.GreetingService;

public class GreetingServiceImpl implements GreetingService {
    @Override
    public void greet(String msg) {
        System.out.println("hello world"); // 按要求固定打印
    }
}
