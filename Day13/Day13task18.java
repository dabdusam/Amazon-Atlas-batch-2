import java.util.*;

public class Day13task18 {
    public static void main(String[] args) {
        // Create a LinkedList and add elements
        LinkedList<String> lobj = new LinkedList<>();
        lobj.add("Abdul");
        lobj.add("Samad");
        lobj.add(".AS");

        // Create a Spliterator for the LinkedList
        Spliterator<String> sitobj = lobj.spliterator();

        // Print each element using forEachRemaining (Spliterator's method)
        System.out.println("Splitting the list:");
        sitobj.forEachRemaining(System.out::println);
    }
}
