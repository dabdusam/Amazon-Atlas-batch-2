package org.example;

/*
 * Demonstrates usage of @BeforeAll, @BeforeEach, @AfterEach, @AfterAll annotations in JUnit 5
 */

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DemoTest008AfterBeforeJunit5 {

    private int val1;
    private int val2;

    // Runs once before all tests (must be static)
    @BeforeAll
    static void setupBeforeAll() {
        System.out.println("Run before all tests");
    }

    // Runs once after all tests (must be static)
    @AfterAll
    static void cleanupAfterAll() {
        System.out.println("Run after all tests");
    }

    // Runs before each test
    @BeforeEach
    void setupBeforeEach() {
        System.out.println("Run before each test");
        val1 = 10;
        val2 = 5;
    }

    // Runs after each test
    @AfterEach
    void cleanupAfterEach() {
        System.out.println("Run after each test");
    }

    // Sample test method 1
    @Test
    void testAddition() {
        System.out.println("Testing addition of two numbers");
        int result = val1 + val2;
        assertEquals(15, result, "Sum should be 15");
    }

    // Sample test method 2
    @Test
    void testSampleMethod() {
        System.out.println("Sample test method");
        // Just a dummy assertion
        assertEquals(5, 5, "This should always pass");
    }
}

