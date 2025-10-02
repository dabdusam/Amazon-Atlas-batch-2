package org.example;

/*
 * Demonstrates the use of Hamcrest matchers in JUnit 5
 * Using assertThat() to compare strings ignoring case
 */

import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class DemoTest01Hamcrest {

    @Test
    public void hamcrestMethod() {
        String str1 = "Apple";
        String str2 = "Apple";

        // Asserts that str1 equals str2 ignoring case
        assertThat(str1, equalToIgnoringCase(str2));

        // Additional examples of Hamcrest matchers:
        int number = 10;
        assertThat(number, greaterThan(5));
        assertThat(number, lessThanOrEqualTo(10));

        String text = "Hello World";
        assertThat(text, containsString("World"));
        assertThat(text, startsWith("Hello"));
        assertThat(text, endsWith("World"));
    }
}

