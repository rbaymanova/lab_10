package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class SimpleCalculator implements Calculator {

    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public int subtract(int a, int b) {
        return a - b;
    }

    @Override
    public int multiply(int a, int b) {
        return a * b;
    }

    @Override
    public double divide(int a, int b) {
        if (b == 0) throw new ArithmeticException("cannot divide by zero");
        return (double) a / b;
    }
}

