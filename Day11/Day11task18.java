// RemoveDuplicates.java
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Day11task18 {

    public static void main(String[] args) {
        // 1. Original list with duplicates
        List<String> names = Arrays.asList(
                "Hamza", "Abdul", "Mustafa", "Ahmed", "Abdul", "Dawood");

        System.out.println("Original list:");
        names.forEach(System.out::println);

        // 2. Remove duplicate entries with distinct()
        List<String> uniqueNames = names.stream()   // convert list to stream
                .distinct() // keep only unique values
                .collect(Collectors.toList());

        // 3. Display the unique data
        System.out.println("\nList after removing duplicates:");
        uniqueNames.forEach(System.out::println);
    }
}

