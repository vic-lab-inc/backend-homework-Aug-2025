package com.example.service;
public class App {
  public static void main(String[] args) {
    GreetingServiceImpl svc = new GreetingServiceImpl();
    svc.greet("hello world");
  }
}
