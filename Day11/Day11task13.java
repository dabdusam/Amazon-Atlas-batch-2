import java.util.List;
import java.util.ArrayList;

public class Day11task13 {
    public static void main(String[] args) {
        // Use List interface and ArrayList implementation
        List<String> friends = new ArrayList<>();

        // Add first and last names of 5 friends
        friends.add("Himanshu Rajpoot");
        friends.add("Rishab manchanda");
        friends.add("Hemant Kumar");
        friends.add("Ehtesham Hassan ");
        friends.add("Vaishakh Nargund");

        // Display the full names
        System.out.println("My friends are:");
        for (String name : friends) {
            System.out.println(name);
        }
    }
}

