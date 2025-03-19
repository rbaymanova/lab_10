package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("cannot divide by zero");
        }
        return a / b;
    }

//    private final HistoryService historyService;
//
//    @Autowired
//    public CalculatorService(HistoryService historyService) {
//        this.historyService = historyService;
//    }
//
//    public int add(int a, int b) {
//        int result = a + b;
//        historyService.addHistory(a + " + " + b + " = " + result);
//        return result;
//    }
}

