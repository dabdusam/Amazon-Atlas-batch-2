import java.util.ArrayList;
import java.util.List;

public class Day11task14 {

    // Create a static list of places using ArrayList with generics
    static List<String> places = new ArrayList<>();

    // Prepare our data - add places and countries to the list
    public static List<String> getPlaces() {
        places.add("Nepal, Kathmandu");
        places.add("Ooty, Simla");
        places.add("India, Delhi");
        places.add("USA, New York");
        places.add("Africa, Nigeria");

        return places;
    }

    public static void main(String[] args) {
        List<String> myPlaces = getPlaces();
        System.out.println("Places from Nepal:");

        // Stream operations:
        // 1. Filter places that start with "Nepal"
        // 2. Convert them to uppercase
        // 3. Sort them alphabetically
        // 4. Print each place
        myPlaces.stream()
                .filter(p -> p.startsWith("Nepal"))
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);
    }
}

