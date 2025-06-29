public class Day13task04 {

    // Node class with one value
    static class Node {
        int data;       // To hold the value
        Node next;      // Pointer to the next node

        Node(int value) {
            this.data = value;
            this.next = null;
        }
    }

    // Head of the list
    static Node head = null;

    // Method to insert a new node at the end
    public static void insertAtEnd(int value) {
        Node newNode = new Node(value);

        if (head == null) {
            head = newNode; // First node becomes head
        } else {
            Node temp = head;

            // Traverse to the last node
            while (temp.next != null) {
                temp = temp.next;
            }

            temp.next = newNode; // Link new node at the end
        }
    }

    // Method to display the list
    public static void displayList() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("NULL");
    }

    public static void main(String[] args) {
        // Insert values into the list
        insertAtEnd(19);
        insertAtEnd(25);
        insertAtEnd(42);

        // Display the list
        System.out.println("Linked List:");
        displayList();
    }
}

