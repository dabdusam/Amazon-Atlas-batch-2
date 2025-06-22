// FilterOddArrayList.java
// Creates an ArrayList of integers, filters out the odd numbers, and displays them.

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Day11task17 {

    public static void main(String[] args) {

        // 1. Create an ArrayList with some numbers
        List<Integer> numbers = new ArrayList<>();
        numbers.add(12);
        numbers.add(7);
        numbers.add(5);
        numbers.add(8);
        numbers.add(3);
        numbers.add(10);
        numbers.add(15);

        // 2. Filter only the odd numbers using a stream
        List<Integer> oddNumbers = numbers.stream()
                .filter(num -> num % 2 != 0)    // keep numbers where remainder when /2 is 1
                .collect(Collectors.toList());  // collect results into a new list

        // 3. Display the odd numbers
        System.out.println("Odd numbers in the list:");
        oddNumbers.forEach(System.out::println);
    }
}

