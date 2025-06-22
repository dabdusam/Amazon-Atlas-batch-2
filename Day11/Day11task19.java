import java.util.stream.Stream;

public class Day11task19 {
    public static void main(String[] args) {

        // create a stream of integers: 1, 2, 3, … up to 20
        Stream<Integer> nums = Stream
                .iterate(1, n -> n + 1)
                .limit(20);          // keep the first 20 numbers

        // display only the first 10 numbers
        nums
                .limit(10)           // keep 1‑10
                .forEach(System.out::println);
    }
}
