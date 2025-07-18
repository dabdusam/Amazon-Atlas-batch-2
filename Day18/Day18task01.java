import java.util.LinkedList;

public class Day18task01 {

    @SuppressWarnings("unchecked")
    LinkedList<Entry>[] data = (LinkedList<Entry>[]) new LinkedList[10];

    // Method to add or update a key-value pair
    public void put(String keyval, int value) {
        int index = Math.abs(keyval.hashCode() % data.length);

        if (data[index] == null) {
            data[index] = new LinkedList<>();
        }

        for (Entry e : data[index]) {
            if (e.keyval.equals(keyval)) {
                e.value = value; // Update existing value
                return;
            }
        }

        data[index].add(new Entry(keyval, value)); // Add new entry
    }

    // Method to retrieve a value by key
    public Integer get(String keyval) {
        int index = Math.abs(keyval.hashCode() % data.length);

        if (data[index] != null) {
            for (Entry e : data[index]) {
                if (e.keyval.equals(keyval)) {
                    return e.value;
                }
            }
        }
        return null; // Not found
    }

    // Method to remove an entry by key
    public void remove(String keyval) {
        int index = Math.abs(keyval.hashCode() % data.length);

        if (data[index] != null) {
            data[index].removeIf(e -> e.keyval.equals(keyval));
        }
    }

    // Method to print all key-value pairs
    public void printAll() {
        for (int i = 0; i < data.length; i++) {
            if (data[i] != null) {
                for (Entry e : data[i]) {
                    System.out.println("Key: " + e.keyval + ", Value: " + e.value);
                }
            }
        }
    }

    // Inner class for storing key-value pairs
    static class Entry {
        String keyval;
        int value;

        Entry(String k, int v) {
            keyval = k;
            value = v;
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        Day18task01 map = new Day18task01();

        map.put("apple", 10);
        map.put("banana", 20);
        map.put("orange", 30);
        map.put("apple", 99); // Updating value for "apple"

        System.out.println("Value for key 'apple': " + map.get("apple"));
        map.printAll();

        map.remove("banana");
        System.out.println("After removing 'banana':");
        map.printAll();
    }
}

