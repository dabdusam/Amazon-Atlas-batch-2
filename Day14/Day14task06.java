import java.util.Stack;

public class Day14task06 {
    public static void main(String[] args) {
        // Create a stack of strings
        Stack<String> stack = new Stack<>();

        // Push elements onto the stack
        stack.push("Apple");
        stack.push("Banana");
        stack.push("Cherry");

        // Display the stack
        System.out.println("Current stack: " + stack);

        // Peek the top element without removing it
        String topElement = stack.peek();

        // Print the top element
        System.out.println("Element at the top (peek): " + topElement);

        // Display the stack again to show it hasn't changed
        System.out.println("Stack after peek: " + stack);
    }
}

