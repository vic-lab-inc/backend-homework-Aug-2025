package com.example.service;

import com.example.api.GreetingSerivce;

public class GreetingServiceImpl implements GreetingSerivce {
   @Override
   public void greet(String msg) {
       System.out.println("hello world: " + msg);

   }
}
