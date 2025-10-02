package org.example;

/*
 Dynamic Tests in JUnit 5 - can be generated at runtime
 using @TestFactory annotation
*/

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

import java.util.Collection;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;

public class DemoTest006DynamicTestJunit5 {

    Demo6 demo = new Demo6();

    @TestFactory
    Collection<DynamicTest> dynamicTestCase() {
        // Generate dynamic test cases for different numbers
        return testCases().map(val ->
                dynamicTest("Check if " + val + " is even",
                        () -> assertTrue(demo.isEven(val), val + " should be even"))
        ).toList();
    }

    private Stream<Integer> testCases() {
        return Stream.of(100, 200, 300, 400, 5000);
    }
}

