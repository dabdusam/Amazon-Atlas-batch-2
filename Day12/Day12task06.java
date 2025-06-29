import java.util.HashMap;

public class Day12task06 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Anitha", 101);
        map.put("Kavitha", 102);
        map.put("Meera", 103);

        // Using get() method to retrieve and print values
        for (String key : map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }
    }
}

