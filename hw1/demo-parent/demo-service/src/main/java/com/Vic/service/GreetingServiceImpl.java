package com.Vic.service;

import com.Vic.api.GreetingService;

public class GreetingServiceImpl implements GreetingService{
    @Override
    public void greet( String msg) {
        System.out.println("Hello World" + msg);
    }

    public static void main(String[] args) {
        new GreetingServiceImpl().greet("");
    }
}
