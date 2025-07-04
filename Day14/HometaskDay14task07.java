
import java.util.Scanner;

public class HometaskDay14task07 {

    // Recursive function to convert decimal to binary
    public static void toBinary(int num) {
        if (num == 0) {
            return;
        }
        toBinary(num / 2); // Recursive call
        System.out.print(num % 2); // Print remainder (binary digit)
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter a decimal number: ");
        int number = sc.nextInt();

        // Edge case for 0
        if (number == 0) {
            System.out.print("Binary: 0");
        } else {
            System.out.print("Binary: ");
            toBinary(number);
        }
    }
}

