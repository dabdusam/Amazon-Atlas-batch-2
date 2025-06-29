import java.util.LinkedList;

public class Day13task14 {

    public static void main(String[] args) {
        LinkedList<String> fruits = new LinkedList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.addFirst("Orange");
        fruits.addLast("Pineapple");

        // Display all elements without loops
        System.out.println("Fruits List: " + fruits);
    }
}

