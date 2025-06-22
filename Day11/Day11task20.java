// SkipNumbersDemo.java
// Creates an ArrayList with the numbers 1 – 20,
// skips the first 15 numbers, and prints the rest (16 – 20).

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Day11task20 {
    public static void main(String[] args) {

        // 1. Build an ArrayList containing 1 .. 20
        List<Integer> numbers = Stream
                .iterate(1, n -> n + 1)   // 1, 2, 3, ...
                .limit(20)                // stop at 20
                .collect(Collectors.toList());

        // 2. Skip the first 15 values and print the remaining ones
        numbers.stream()                  // turn the list back into a stream
                .skip(15)                  // ignore the first 15 numbers
                .forEach(System.out::println); // print 16, 17, 18, 19, 20
    }
}

