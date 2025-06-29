import java.util.*;
public class Day13task21 {
    public static void main(String[] args)     {


        LinkedList<String> l = new LinkedList<>();


        l.add("Abdul");
        l.add("Samad");
        l.add(".AS");

        System.out.println(l);

        Spliterator<String> it = l.spliterator();


        System.out.println("Splitting the list:");
        it.forEachRemaining(System.out::println);
    }
}









