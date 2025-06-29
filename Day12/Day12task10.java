import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Day12task10 {
    public static void main(String[] args) {
        // Create a regular HashMap
        HashMap<String, String> originalMap = new HashMap<>();

        // Wrap it with synchronized map
        Map<String, String> syncMap = Collections.synchronizedMap(originalMap);

        // Add regular entries
        syncMap.put("Name", "Abdul");
        syncMap.put("City", "Hyderabad");

        // Add null key values
        syncMap.put(null, "First Null Value");
        syncMap.put(null, "Second Null Value");  // Overwrites previous one

        // Retrieve and print values
        System.out.println("Name: " + syncMap.get("Name"));
        System.out.println("City: " + syncMap.get("City"));
        System.out.println("Null Key Value: " + syncMap.get(null));
        // If you're accessing the map in multiple threads, always synchronize when iterating:
        synchronized (syncMap) {
            System.out.println("\nSynchronized HashMap content:");
            for (String key : syncMap.keySet()) {
                System.out.println("Key: " + key + " | Value: " + syncMap.get(key));
            }
        }
    }
}


