import java.util.Hashtable;

public class Day12task05 {
    public static void main(String[] args) {
        Hashtable<String, Integer> ht = new Hashtable<>();
        ht.put("Anitha", 101);
        ht.put("Kavitha", 102);
        ht.put("Meera", 103);

        // Using get() method
        for (String key : ht.keySet()) {
            System.out.println(key + ": " + ht.get(key));
        }
    }
}

