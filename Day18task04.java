import java.util.ArrayList;

public class Day18task04 {
    public static void main(String[] args) {
        // Input array
        int[] numbers = {45, 81, 85, 100, 20, 95, 60, 10, 21};

        // Group arrays
        ArrayList<Integer> array1 = new ArrayList<>(); // ends with 0
        ArrayList<Integer> array2 = new ArrayList<>(); // ends with 1
        ArrayList<Integer> array3 = new ArrayList<>(); // ends with 5

        // Grouping logic
        for (int num : numbers) {
            int lastDigit = num % 10;

            if (lastDigit == 0) {
                array1.add(num);
            } else if (lastDigit == 1) {
                array2.add(num);
            } else if (lastDigit == 5) {
                array3.add(num);
            }
        }

        // Display results
        System.out.print("Array 1 has: ");
        for (int n : array1) System.out.print(n + " ");
        System.out.println();

        System.out.print("Array 2 has: ");
        for (int n : array2) System.out.print(n + " ");
        System.out.println();

        System.out.print("Array 3 has: ");
        for (int n : array3) System.out.print(n + " ");
        System.out.println();
    }
}
