package com.vic.service;

import com.vic.api.GreetingService;

public class GreetingServiceImpl implements GreetingService {
    @Override
    public void greeting(String message) {
        System.out.println("Hello " + message);
    }
}
