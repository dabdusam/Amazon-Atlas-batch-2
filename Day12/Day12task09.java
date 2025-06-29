import java.util.HashMap;

public class Day12task09 {
    public static void main(String[] args) {
        // Create a HashMap
        HashMap<String, String> map = new HashMap<>();

        // Add regular entries
        map.put("Name", "Abdul");
        map.put("City", "Hyderabad");

        // Add a null key with a value
        map.put(null, "First Null Value");

        // Add null key again with a different value (this will overwrite the first one)
        map.put(null, "Second Null Value");

        // Retrieve and print values
        System.out.println("Name: " + map.get("Name"));
        System.out.println("City: " + map.get("City"));
        System.out.println("Null Key Value: " + map.get(null));

        // Print entire HashMap
        System.out.println("\nHashMap content:");
        for (String key : map.keySet()) {
            System.out.println("Key: " + key + " | Value: " + map.get(key));
        }
    }
}

