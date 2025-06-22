import java.util.List;
import java.util.ArrayList;

public class Day11task15 {
    public static void main(String[] args) {
        // Use List interface and ArrayList implementation
        List<String> friends = new ArrayList<>();

        // Add first and last names of 5 friends
        friends.add("Himanshu Rajpoot");
        friends.add("Rishab Manchanda");
        friends.add("Hemant Kumar");
        friends.add("Ehtesham Hassan");
        friends.add("Vaishakh Nargund");

        System.out.println("Filtered, mapped, sorted friends:");

        friends.stream()
                .filter(name -> name.toLowerCase().startsWith("h"))  // filter names starting with 'h' or 'H'
                .map(String::toUpperCase)                            // convert names to uppercase
                .sorted()                                           // sort alphabetically
                .forEach(System.out::println);                      // print each name
    }
}

