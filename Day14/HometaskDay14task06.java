
import java.util.Scanner;

public class HometaskDay14task06 {

    // Recursive function to reverse a string
    public static String reverse(String str) {
        // Base case: if string is empty or has one character
        if (str == null || str.length() <= 1) {
            return str;
        }
        // Recursive step: reverse the rest and append first character at the end
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

