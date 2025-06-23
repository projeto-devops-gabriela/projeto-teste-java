package com.example.demo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DemoApplicationTests {

    private final DemoApplication calculator = new DemoApplication();

    @Test
    public void testAdd() {
        assertEquals(5.0, calculator.add(2.0, 3.0));
        assertEquals(-1.0, calculator.add(-2.0, 1.0));
        assertEquals(0.0, calculator.add(0.0, 0.0));
    }

    @Test
    public void testSubtract() {
        assertEquals(1.0, calculator.subtract(3.0, 2.0));
        assertEquals(-3.0, calculator.subtract(-2.0, 1.0));
        assertEquals(0.0, calculator.subtract(0.0, 0.0));
    }

    @Test
    public void testMultiply() {
        assertEquals(6.0, calculator.multiply(2.0, 3.0));
        assertEquals(-2.0, calculator.multiply(-2.0, 1.0));
        assertEquals(0.0, calculator.multiply(0.0, 5.0));
    }

    @Test
    public void testDivide() {
        assertEquals(2.0, calculator.divide(6.0, 3.0));
        assertEquals(-2.0, calculator.divide(-6.0, 3.0));
        assertThrows(IllegalArgumentException.class, () -> calculator.divide(1.0, 0.0));
    }
}
