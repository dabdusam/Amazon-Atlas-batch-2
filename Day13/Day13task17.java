import java.util.LinkedList;

public class Day13task17 {

    public static void main(String[] args) {
        LinkedList<String> fruits = new LinkedList<>();

        // Push elements onto the list (stack behavior)
        fruits.push("Apple");
        fruits.push("Banana");
        fruits.push("Mango");
        fruits.push("Orange");
        fruits.push("Pineapple");

        System.out.println("List after pushing elements: " + fruits);

        // Pop the first element (top of the stack)
        String popped = fruits.pop();
        System.out.println("Popped element: " + popped);

        System.out.println("List after popping an element: " + fruits);
    }
}

