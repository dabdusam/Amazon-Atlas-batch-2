import java.util.LinkedList;

public class Day13task15 {

    public static void main(String[] args) {
        LinkedList<String> fruits = new LinkedList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.addFirst("Orange");
        fruits.addLast("Pineapple");

        // Convert LinkedList to an array
        Object[] array = fruits.toArray();

        // Display the array elements
        System.out.println("Array elements:");
        for (Object obj : array) {
            System.out.print(obj + " ");
        }
        System.out.println();
    }
}


