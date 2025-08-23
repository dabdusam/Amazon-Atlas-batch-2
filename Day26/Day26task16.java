import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Custom exception for illegal singleton instantiation
class IllegalStaticException extends RuntimeException {
    public IllegalStaticException(String message) {
        super(message);
    }
}

// Singleton class
class DManager {

    // 1. Private static variable to hold singleton instance
    private static DManager instance;

    // 2. Private list variable (thread-safe)
    private final List<String> itemList;

    // 3. Private constructor to prevent direct instantiation
    private DManager() {
        if (instance != null) {
            throw new IllegalStaticException("Use getInstance() to create the singleton instance.");
        }
        // Initialize the thread-safe list
        itemList = Collections.synchronizedList(new ArrayList<>());
    }

    // 4. Public synchronized method to get the singleton instance (thread-safe)
    public static synchronized DManager getInstance() {
        if (instance == null) {
            instance = new DManager();
        }
        return instance;
    }

    // 5. Thread-safe methods to manage the list

    // Add an item to the list
    public void addItem(String item) {
        itemList.add(item);
    }

    // Remove an item from the list
    public void removeItem(String item) {
        itemList.remove(item);
    }

    // Retrieve all items (returns a copy to avoid external modification)
    public List<String> retrieveItems() {
        synchronized (itemList) { // synchronize during iteration
            return new ArrayList<>(itemList);
        }
    }

    // Print current items
    public void printItems() {
        synchronized (itemList) {
            System.out.println("Items: " + itemList);
        }
    }
}

// Main class
public class Day26task16 {
    public static void main(String[] args) {
        DManager manager = DManager.getInstance();

        manager.addItem("Item1");
        manager.addItem("Item2");

        manager.printItems(); // Output: Items: [Item1, Item2]

        manager.removeItem("Item1");
        manager.printItems(); // Output: Items: [Item2]

        System.out.println("Retrieved items: " + manager.retrieveItems());
    }
}
