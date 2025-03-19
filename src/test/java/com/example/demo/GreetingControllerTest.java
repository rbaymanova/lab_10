package com.example.demo;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@RunWith(SpringRunner.class)
public class GreetingControllerTest {

    @Autowired
    private GreetingController greetingController;

    @Test
    public void testGreet() {
        String result = greetingController.greet();
        assertEquals("Hello, Spring Boot!", result);
    }
}
