public class Day12task07<Key, Value> {

    // Node class for each entry
    private class HashTableNode {
        private Key key;
        private Value value;
        private boolean active;
        private boolean tombstoned;

        public HashTableNode() {
            key = null;
            value = null;
            active = false;
            tombstoned = false;
        }

        public HashTableNode(Key initKey, Value initData) {
            key = initKey;
            value = initData;
            active = true;
            tombstoned = false;
        }
    }

    private final static int TABLE_SIZE = 9;
    private Object[] table;

    // Constructor
    public Day12task07() {
        table = new Object[TABLE_SIZE];
        for (int j = 0; j < TABLE_SIZE; j++) {
            table[j] = new HashTableNode();
        }
    }

    // Hash function
    private int hash(Key key) {
        return Math.abs(key.hashCode()) % TABLE_SIZE;
    }

    // PUT method (Insert or Update)
    public Value put(Key key, Value value) {
        int idx = hash(key);
        int startIdx = idx;

        do {
            @SuppressWarnings("unchecked")
            HashTableNode node = (HashTableNode) table[idx];

            if (!node.active) {
                table[idx] = new HashTableNode(key, value);
                return null; // new insert
            } else if (node.active && node.key.equals(key)) {
                Value oldValue = node.value;
                node.value = value; // update
                return oldValue;
            }

            idx = (idx + 1) % TABLE_SIZE;
        } while (idx != startIdx);

        throw new RuntimeException("Hash table is full");
    }

    // GET method
    public Value get(Key key) {
        int idx = hash(key);
        int startIdx = idx;

        do {
            @SuppressWarnings("unchecked")
            HashTableNode node = (HashTableNode) table[idx];

            if (!node.active && !node.tombstoned) {
                return null; // Not found
            } else if (node.active && node.key.equals(key)) {
                return node.value;
            }

            idx = (idx + 1) % TABLE_SIZE;
        } while (idx != startIdx);

        return null;
    }

    // REMOVE method
    public Value remove(Key key) {
        int idx = hash(key);
        int startIdx = idx;

        do {
            @SuppressWarnings("unchecked")
            HashTableNode node = (HashTableNode) table[idx];

            if (!node.active && !node.tombstoned) {
                return null; // Not found
            } else if (node.active && node.key.equals(key)) {
                node.active = false;
                node.tombstoned = true;
                return node.value;
            }

            idx = (idx + 1) % TABLE_SIZE;
        } while (idx != startIdx);

        return null;
    }

    // DISPLAY method
    public void display() {
        System.out.println("Hash Table Contents:");
        for (int i = 0; i < TABLE_SIZE; i++) {
            @SuppressWarnings("unchecked")
            HashTableNode node = (HashTableNode) table[i];
            if (node.active) {
                System.out.println("Index " + i + ": " + node.key + " → " + node.value);
            } else {
                System.out.println("Index " + i + ": Empty");
            }
        }
    }

    // MAIN method for testing
    public static void main(String[] args) {
        HashTable<String, Integer> ht = new HashTable<>();
        ht.put("A", 1);
        ht.put("B", 2);
        ht.put("C", 3);
        ht.put("I", 9);  // May cause collision
        ht.put("R", 18); // May cause collision

        ht.display();

        System.out.println("\nGet 'B': " + ht.get("B"));
        System.out.println("Remove 'C': " + ht.remove("C"));
        System.out.println("Get 'C' after removal: " + ht.get("C"));

        ht.display();
    }
}
