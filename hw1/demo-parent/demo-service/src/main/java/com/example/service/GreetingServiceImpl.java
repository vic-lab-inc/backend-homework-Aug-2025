package com.example.service;
import com.example.api.GreetingService;

public class GreetingServiceImpl implements GreetingService {
    @Override
    public void greet(String msg) {
        System.out.println("hello world pd"); // 按题意固定打印
    }
    public static void main(String[] args) {
        new GreetingServiceImpl().greet("");
    }
}
