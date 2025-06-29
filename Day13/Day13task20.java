class Node {
    int data;
    Node next; // Reference to the next node
    Node prev; // Reference to the previous node

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

public class Day13task20 {
    Node head; // Start of the list

    // Insert at the end of the list
    public void insertEnd(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
        newNode.prev = temp;
    }

    // Forward traversal
    public void displayForward() {
        System.out.println("Forward Traversal:");
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Backward traversal
    public void displayBackward() {
        System.out.println("Backward Traversal:");
        Node temp = head;
        if (temp == null) return;

        // Go to the last node
        while (temp.next != null) {
            temp = temp.next;
        }

        // Traverse backwards
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.prev;
        }
        System.out.println();
    }

    // Main method
    public static void main(String[] args) {
        Day13task20 dll = new Day13task20();

        dll.insertEnd(10);
        dll.insertEnd(20);
        dll.insertEnd(30);
        dll.insertEnd(40);

        dll.displayForward();   // Output: 10 20 30 40
        dll.displayBackward();  // Output: 40 30 20 10
    }
}

