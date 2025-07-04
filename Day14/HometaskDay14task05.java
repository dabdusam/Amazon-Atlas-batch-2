import java.util.Scanner;

public class HometaskDay14task05 {

    // Recursive function to count digits
    public static int countDigits(int num) {
        if (num == 0)
            return 0;
        return 1 + countDigits(num / 10);
    }

    // Recursive function to sum digits
    public static int sumDigits(int num) {
        if (num == 0)
            return 0;
        return (num % 10) + sumDigits(num / 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        // Handling 0 as special case
        int digitCount = (number == 0) ? 1 : countDigits(number);
        int digitSum = sumDigits(number);

        // Output
        System.out.println("Number of digits: " + digitCount);
        System.out.println("Sum of digits: " + digitSum);
    }
}

