public class Day13task25 {

    // Node class
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Head and tail references
    Node head = null;
    Node tail = null;

    // Custom method to create and add a new node
    public void addNode(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
            newNode.next = head; // Make it circular
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head; // Maintain circular link
        }
    }

    // Custom method to traverse and display the list
    public void display() {
        if (head == null) {
            System.out.println("Circular Linked List is empty.");
            return;
        }

        Node current = head;
        System.out.print("Circular Linked List: ");
        do {
            System.out.print(current.data + " ");
            current = current.next;
        } while (current != head);
        System.out.println();
    }

    // Main method to test
    public static void main(String[] args) {
        Day13task25 list = new Day13task25();

        // Add elements using custom method
        list.addNode(10);
        list.addNode(20);
        list.addNode(30);
        list.addNode(40);

        // Display elements using custom method
        list.display();
    }
}

