import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Day22task01 {

    // Single tag via @Tags with one value (could also just use @Tag)
    @Test
    @Tags({ @Tag("firstPriority") })
    void testMethod01() {
        // Example assertion: simple math
        int result = 2 + 3;
        assertEquals(5, result, "2 + 3 should equal 5");
    }

    // Single tag using @Tag
    @Test
    @Tag("firstPriority")
    void runTestcase02() {
        // Example assertion: string contains
        String full = "hello world";
        assertTrue(full.contains("hello"), "Should contain 'hello'");
    }

    // Demonstrating multiple tags (fast + another)
    @Test
    @Tags({ @Tag("fastTag"), @Tag("smoke") })
    void testMethod03() {
        // Example assertion: boolean check
        boolean isActive = true;
        assertTrue(isActive, "isActive should be true");
    }

    @Test
    @Tag("slowTag")
    void runTestcase04() {
        // Example assertion: equality with message
        String expected = "JUnit";
        String actual = "JUnit";
        assertEquals(expected, actual, "Expected and actual should match");
    }
}

