package org.example;

/*
 * Tag and Filter - tag test cases using @Tag annotation.
 * Tags are labels to categorize the test cases.
 * Filter - used to filter and run the test cases by using the Tags.
 */

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class DemoTest007Tag_FilterJunit5 {

    // A test tagged as "slow"
    @Test
    @Tag("slow")
    void slowTest() {
        assertTrue(true, "slow test method");
    }

    // A test tagged as "fast"
    @Test
    @Tag("fast")
    void fastTest() {
        assertTrue(true, "fast test method");
    }

    // A test tagged as both "fast" and "integration"
    @Test
    @Tag("fast")
    @Tag("integration")
    void fastIntegrationTest() {
        assertTrue(true, "fast integration test method");
    }
}

