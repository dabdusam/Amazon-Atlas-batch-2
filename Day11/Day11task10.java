// ReverseString.java

import java.util.Scanner;

public class Day11task10 {
    public static void main(String[] args) {
        // Take input from the user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String original = sc.nextLine();

        // Reverse the string using a loop
        String reversed = "";
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed += original.charAt(i);
        }

        // Print the reversed string
        System.out.println("Reversed string: " + reversed);
    }
}

