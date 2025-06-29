import java.util.HashMap;

public class Day12task08 {
    public static void main(String[] args) {
        // Create a HashMap
        HashMap<String, String> map = new HashMap<>();

        // Add entries to the HashMap
        map.put("Name", "Abdul");
        map.put("City", "Hyderabad");

        // Add a null key with a value
        map.put(null, "This is a null key");

        // Retrieve values
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

