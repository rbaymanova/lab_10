package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {
    @Override
    public String getGreeting () {
        return "Hello , Spring Boot !";
    }
}

@Service
class FriendlyGreetingService implements GreetingService {

    @Override
    public String getGreeting() {
        return "Hey there, friend!";
    }
}

