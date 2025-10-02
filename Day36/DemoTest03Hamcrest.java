package org.example;

import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasProperty;

public class DemoTest03Hamcrest {

    @Test
    void method01() {
        Customer customer = new Customer("John", "Abraham");

        // Check if bean has the property "fname"
        assertThat(customer, hasProperty("fname"));

        // Check if bean has the property "lname"
        assertThat(customer, hasProperty("lname"));
    }
}

