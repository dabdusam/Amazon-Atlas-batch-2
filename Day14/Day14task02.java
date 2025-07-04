public class Day14task02 {

    // Custom Node class
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Traverse and display circular singly linked list
    public static void traverse(Node head) {
        if (head == null) return;

        Node current = head;
        do {
            System.out.println(current.data);
            current = current.next;
        } while (current != head);
    }

    public static void main(String[] args) {
        // Create nodes
        Node node1 = new Node(10);
        Node node2 = new Node(20);
        Node node3 = new Node(30);
        Node node4 = new Node(40);

        // Link nodes circularly
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node1;  // Circular link

        System.out.println("Circular Singly Linked List:");
        traverse(node1);
    }
}
