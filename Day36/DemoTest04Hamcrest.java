package org.example;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.empty;

public class DemoTest04Hamcrest {

    @Test
    public void method1() {
        List<String> custList = new ArrayList<>();
        // Verify that the list is empty
        assertThat(custList, empty());
    }
}

