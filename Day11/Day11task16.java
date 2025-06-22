import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Day11task16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();

        System.out.println("Enter 5 integers:");

        // Read 5 integers from the user
        for (int i = 0; i < 5; i++) {
            int num = sc.nextInt();
            numbers.add(num);
        }

        // Use stream to square each number and collect into a new list
        List<Integer> squares = numbers.stream()
                .map(num -> num * num)               // square each number
                .collect(Collectors.toList());      // collect results into a list

        System.out.println("Squares of the entered numbers:");
        squares.forEach(System.out::println);      // print each squared number

        sc.close();
    }
}

