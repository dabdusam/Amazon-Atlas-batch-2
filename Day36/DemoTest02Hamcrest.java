package org.example;

import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasToString;

public class DemoTest02Hamcrest {

    @Test
    public void method1() {
        Customer customer = new Customer("John", "Abraham");
        String str = customer.toString();
        assertThat(customer, hasToString(str));
    }
}
