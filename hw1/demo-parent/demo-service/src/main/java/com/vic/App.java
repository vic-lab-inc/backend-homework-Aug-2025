package com.vic;

import com.vic.api.GreetingService;
import com.vic.service.GreetingServiceImpl;

public class App {
    public static void main(String[] args) {
        GreetingService greetingService = new GreetingServiceImpl();
        greetingService.greeting("World");
    }
}
