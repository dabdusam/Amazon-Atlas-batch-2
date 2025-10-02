package org.example;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasSize;

public class DemoTest05Hamcrest {

    @Test
    public void method2() {
        List<String> custList = Arrays.asList("john", "Mary", "Sheik", "Singh");

        // Verify that the list has exactly 4 elements
        assertThat(custList, hasSize(4));
    }
}

