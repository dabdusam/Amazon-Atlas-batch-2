import java.util.LinkedList;

public class Day13task11 {

    public static void main(String[] args) {
        // Create a LinkedList of Strings
        LinkedList<String> fruits = new LinkedList<>();

        // Add elements
        fruits.add("Apple");
        fruits.add("Chickoo");
        fruits.add("Mango");

        // Add at the beginning and end
        fruits.addFirst("Orange");
        fruits.addLast("Pineapple");

        // Display the entire list
        System.out.println("Fruits List: " + fruits);

        // Get and display the first element
        String firstElement = fruits.getFirst();
        System.out.println("First element: " + firstElement);

        // Get and display the last element
        String lastElement = fruits.getLast();
        System.out.println("Last element: " + lastElement);
        System.out.println("Before update: " + fruits);

        // Update the first element (index 0) to "Strawberry"
        fruits.set(3, "Strawberry");

        System.out.println("After updating first element: " + fruits);
    }
}

