package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DemoApplicationTests {

    DemoApplication app = new DemoApplication();

    @Test
    void testAdd() {
        assertEquals(5.0, app.add(2, 3));
    }

    @Test
    void testDivideByZero() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            app.divide(1, 0);
        });
        assertEquals("Division by zero is not allowed.", exception.getMessage());
    }
}
