import java.util.Scanner;

public class Day12task02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();  // Read name input

        // Reverse the name using a loop
        String reversed = "";
        for (int i = name.length() - 1; i >= 0; i--) {
            reversed += name.charAt(i);
        }

        System.out.println("Your name in reverse is: " + reversed);

        scanner.close();
    }
}

