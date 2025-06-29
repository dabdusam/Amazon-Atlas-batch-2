import java.util.LinkedList;

public class Day13task16 {

    public static void main(String[] args) {
        LinkedList<String> fruits = new LinkedList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.addFirst("Orange");
        fruits.addLast("Pineapple");

        // Clone the linked list
        @SuppressWarnings("unchecked")
        LinkedList<String> clonedFruits = (LinkedList<String>) fruits.clone();

        // Display original list
        System.out.println("Original list: " + fruits);

        // Display cloned list
        System.out.println("Cloned list: " + clonedFruits);

        // Check if both are different objects
        System.out.println("Are they the same object? " + (fruits == clonedFruits));
    }
}

