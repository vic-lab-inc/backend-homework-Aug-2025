package org.example;
import org.example.GreetingService;

public class GreetingServiceImpl implements GreetingService{
    @Override
    public void greet(String msg) {
        System.out.println("hello world" + msg);
    }

    public static void main(String[] args) {
        GreetingService service = new GreetingServiceImpl();
        service.greet("from demo-service");
    }
}
