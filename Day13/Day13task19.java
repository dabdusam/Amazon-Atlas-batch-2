import java.util.LinkedList;
import java.util.Spliterator;

public class Day13task19 {
    public static void main(String[] args) {

        // Step 1: Create and populate the LinkedList
        LinkedList<String> llobj = new LinkedList<String>();
        llobj.add("Abdul");
        llobj.add("Samad");
        llobj.add(".AS");
        llobj.add("MP");

        // Step 2: Create a Spliterator from the LinkedList
        Spliterator<String> itobj1 = llobj.spliterator();

        // Step 3: Try to split the spliterator into two parts
        Spliterator<String> itobj2 = itobj1.trySplit();

        // Step 4: Use the first spliterator to process part of the list
        System.out.println("spliterator 1");
        while (itobj1.tryAdvance((n) -> { System.out.println(n); }));

        // Step 5: Use the second spliterator to process the remaining part
        System.out.println("spliterator 2");
        while (itobj2.tryAdvance((n) -> { System.out.println(n); }));
    }
}

