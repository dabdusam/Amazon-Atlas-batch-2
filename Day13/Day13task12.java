import java.util.LinkedList;

public class Day13task12 {

    public static void main(String[] args) {
        // Create a LinkedList of Strings
        LinkedList<String> fruits = new LinkedList<>();

        // Add elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");

        // Add at the beginning and end
        fruits.addFirst("Orange");
        fruits.addLast("Pineapple");

        // Display the entire list before removals
        System.out.println("Fruits List before removals: " + fruits);

        // Remove the first element
        fruits.removeFirst();

        // Remove the last element
        fruits.removeLast();

        // Display the list after removals
        System.out.println("Fruits List after removing first and last elements: " + fruits);
    }
}

