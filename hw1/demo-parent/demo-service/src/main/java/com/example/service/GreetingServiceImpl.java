package com.example.service;

import com.example.api.GreetingService;

public class GreetingServiceImpl implements GreetingService {

    @Override
    public void greet(String msg) {
        System.out.println("hello world");
    }

    // 添加main方法用于测试
    public static void main(String[] args) {
        GreetingServiceImpl service = new GreetingServiceImpl();
        service.greet("test message");
    }
}