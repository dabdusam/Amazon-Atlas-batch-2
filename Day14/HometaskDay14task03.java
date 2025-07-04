
import java.util.Scanner;

public class HometaskDay14task03 {

    // Recursive method to reverse a string
    public static String reverse(String str) {
        if (str.isEmpty()) {
            return str; // base case: empty string
        }
        return reverse(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Output
        String reversed = reverse(input);
        System.out.println("Reversed string: " + reversed);
    }
}

