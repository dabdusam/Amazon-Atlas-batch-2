import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Day11task22 {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // Sum of all elements using reduce
        Optional<Integer> sum = numbers.stream().reduce((x, y) -> x + y);
        System.out.println("Sum of all elements: " + sum.orElse(0));

        // Maximum element using reduce and method reference
        Optional<Integer> max = numbers.stream().reduce(Integer::max);
        System.out.println("Maximum element: " + max.orElse(0));

        List<String> strings = Arrays.asList("Hello", " ", "world", "!");

        // Concatenate all strings using reduce
        Optional<String> concatenatedString = strings.stream().reduce((x, y) -> x + y);
        System.out.println("Concatenated string: " + concatenatedString.orElse(""));
    }
}

