package com.example.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

public class GreetingServiceImplTest {
    @Test
    void testGreet() {
        // 这个测试主要是为了验证编译和依赖是否正确
        GreetingServiceImpl service = new GreetingServiceImpl();
        // 调用方法，如果没报错说明实现类成功实现了接口
        assertDoesNotThrow(() -> service.greet("Test Message"));
    }

}
