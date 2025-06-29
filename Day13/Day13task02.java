public class Day13task02 {

    // Node class with one value
    static class Node {
        int data;       // To hold the value
        Node next;      // Pointer to the next node (optional)

        // Constructor to set data
        Node(int value) {
            this.data = value;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        // Create a node and store a value
        Node myNode = new Node(19);

        // Print the value
        System.out.println("Value stored in the node: " + myNode.data);
    }
}
