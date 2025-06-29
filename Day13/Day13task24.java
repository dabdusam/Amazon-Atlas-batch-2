import java.util.HashMap;

public class Day13task24 {
    public static void main(String[] args) {
        // Create HashMap with initial capacity = 10 and load factor = 0.5
        HashMap<String, Integer> myMap = new HashMap<>(10, 0.5f);

        // Add some entries
        myMap.put("Apple", 1);
        myMap.put("Banana", 2);
        myMap.put("Cherry", 3);
        myMap.put("Date", 4);
        myMap.put("Elderberry", 5);

        // Print the map
        System.out.println("Custom Load Factor HashMap: " + myMap);
    }
}

