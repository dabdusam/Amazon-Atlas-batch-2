import java.util.Scanner;

public class HometaskDay14task01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Initialize factorial
        int fact = 1;

        // Loop to calculate factorial
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }

        // Output
        System.out.println("Factorial of " + num + " is: " + fact);
    }
}
