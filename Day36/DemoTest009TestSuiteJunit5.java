package org.example;

/*
 * Test Suite in JUnit 5
 * Combines multiple test classes to run together
 */

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

// Mark this class as a Test Suite
@Suite
// Specify which test classes to include in the suite
@SelectClasses({
        DemoTest008AfterBeforeJunit5.class,
        DemoTest007Tag_FilterJunit5.class
})
public class DemoTest009TestSuiteJunit5 {
    // No code needed here; annotations do all the work
}


