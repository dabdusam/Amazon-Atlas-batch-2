import java.util.Stack;

public class Day14task04 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        // Push elements onto the stack
        stack.push("A");
        stack.push("B");
        stack.push("C");

        System.out.println("Stack after pushing A, B, C: " + stack);

        // Pop elements from the stack
        System.out.println("Popped: " + stack.pop()); // C
        System.out.println("Popped: " + stack.pop()); // B
        System.out.println("Popped: " + stack.pop()); // A
    }
}
