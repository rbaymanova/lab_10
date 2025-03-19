package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    @Autowired
    @Qualifier("scientificCalculator")
    private Calculator calculator;

    @GetMapping("/add")
    public int add(@RequestParam int a, @RequestParam int b) {
        return calculator.add(a, b);
    }

    @GetMapping("/subtract")
    public int subtract(@RequestParam int a, @RequestParam int b) {
        return calculator.subtract(a, b);
    }

    @GetMapping("/multiply")
    public int multiply(@RequestParam int a, @RequestParam int b) {
        return calculator.multiply(a, b);
    }

    @GetMapping("/divide")
    public double divide(@RequestParam int a, @RequestParam int b) {
        return calculator.divide(a, b);
    }
}

