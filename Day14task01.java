public class Day14task01 {

    // Custom Node class
    static class Node {
        int data;
        Node next;

        // Constructor
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Method to traverse and display the list
    public static void traverseAndDisplay(Node head) {
        Node current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    // Main method
    public static void main(String[] args) {
        // Create nodes
        Node node1 = new Node(10);
        Node node2 = new Node(20);
        Node node3 = new Node(30);
        Node node4 = new Node(40);

        // Link the nodes
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        // Display the linked list
        System.out.println("Traversing the custom linked list:");
        traverseAndDisplay(node1);
    }
}
