public class Day13task05 {

    // Node class
    static class Node {
        int data;
        Node next;

        Node(int value) {
            this.data = value;
            this.next = null;
        }
    }

    // Head of the list
    static Node head = null;

    // Insert a new node at the end
    public static void insertAtEnd(int value) {
        Node newNode = new Node(value);

        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    // Delete a node by value
    public static void deleteByValue(int value) {
        if (head == null) return;

        // If the node to delete is the head
        if (head.data == value) {
            head = head.next;
            return;
        }

        Node temp = head;
        Node prev = null;

        // Traverse to find the node
        while (temp != null && temp.data != value) {
            prev = temp;
            temp = temp.next;
        }

        // If not found
        if (temp == null) return;

        // Unlink the node
        prev.next = temp.next;
    }

    // Display the list
    public static void displayList() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("NULL");
    }

    // Main method
    public static void main(String[] args) {
        insertAtEnd(19);
        insertAtEnd(25);
        insertAtEnd(42);

        System.out.println("Original Linked List:");
        displayList();  // 19 -> 25 -> 42 -> NULL

        // Delete a node with value 25
        deleteByValue(25);

        System.out.println("After deleting 25:");
        displayList();  // 19 -> 42 -> NULL
    }
}

