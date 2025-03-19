package com.example.demo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CalculatorServiceTest {

    private final CalculatorService calculatorService = new CalculatorService();

    @Test
    public void testAdd() {
        assertEquals(8, calculatorService.add(5, 3));
    }

    @Test
    public void testSubtract() {
        assertEquals(2, calculatorService.subtract(5, 3));
    }

    @Test
    public void testMultiply() {
        assertEquals(15, calculatorService.multiply(5, 3));
    }

    @Test
    public void testDivide() {
        assertEquals(2.0, calculatorService.divide(6, 3));
    }

    @Test
    public void testDivideByZero() {
        Exception exception = assertThrows(ArithmeticException.class, () -> {
            calculatorService.divide(5, 0);
        });
        assertEquals("cannot divide by zero", exception.getMessage());
    }
}

