import java.util.HashMap;

public class Day13task23 {
    public static void main(String[] args) {

        // Original map (hm1)
        HashMap<String, Integer> hm1 = new HashMap<>();
        hm1.put("A", 100);
        hm1.put("B", 200);
        hm1.put("C", 300);

        // Copy data from hm1 to hm2
        HashMap<String, Integer> hm2 = new HashMap<>(hm1);

        // Print both maps
        System.out.println("Original Map (hm1): " + hm1);
        System.out.println("Copied Map (hm2): " + hm2);
    }
}

