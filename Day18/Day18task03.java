import java.util.Scanner;

public class Day18task03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        long number = scanner.nextLong(); // Use long in case the number is large

        number = Math.abs(number); // Handle negative numbers

        int digitCount = 0;

        if (number == 0) {
            digitCount = 1;
        } else {
            while (number > 0) {
                number = number / 10;
                digitCount++;
            }
        }

        System.out.println("It's a " + digitCount + " digit number.");

        scanner.close();
    }
}

