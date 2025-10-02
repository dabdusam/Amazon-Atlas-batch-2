package org.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DemoTest005ParameterizedTestJunit5 {

    Demo demo = new Demo(); // this now has square(int)

    @ParameterizedTest
    @ValueSource(ints = {100, 25, 30, 70, 40})
    void testSquare(int value) {
        int result = demo.square(value);
        assertEquals(value * value, result, "Square calculation is wrong!");
    }
}
