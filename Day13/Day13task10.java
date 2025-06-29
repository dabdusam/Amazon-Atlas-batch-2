import java.util.LinkedList;

public class Day13task10 {

    public static void main(String[] args) {
        // Create a LinkedList of Strings
        LinkedList<String> fruits = new LinkedList<>();

        // Add elements using predefined methods
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");

        // Add at the beginning
        fruits.addFirst("Orange");

        // Add at the end
        fruits.addLast("Pineapple");

        // Display the linked list
        System.out.println("Fruits List: " + fruits);

        // Remove an element
        fruits.remove("Banana");

        // Display after removal
        System.out.println("After removing Banana: " + fruits);

        // Get element at index 2
        System.out.println("Element at index 2: " + fruits.get(2));

        // Get size
        System.out.println("Size of list: " + fruits.size());

        // Check if list contains "Mango"
        System.out.println("Contains Mango? " + fruits.contains("Mango"));
    }
}

