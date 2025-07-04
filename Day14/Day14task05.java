import java.util.Stack;

public class Day14task05 {
    public static void main(String[] args) {
        Stack<String> names = new Stack<>();

        // Pushing elements onto the stack
        names.push("Abdul");
        names.push("Moin");
        names.push("Akshay");
        names.push("Diana");

        System.out.println("Stack: " + names);

        // Search for an element
        int position = names.search("Akshay");

        if (position != -1) {
            System.out.println("\"Akshay\" found at position: " + position + " from the top");
        } else {
            System.out.println("\"Akshay\" not found in the stack.");
        }
    }
}

