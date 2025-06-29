public class Day13task01 {

    // Define the Node class
    static class Node {
        int data;
        Node next;

        Node(int value) {
            this.data = value;
            this.next = null;
        }
    }

    // Define the LinkedList class
    static class LinkedList {
        Node head;

        // Insert at the end
        void insertAtEnd(int value) {
            Node newNode = new Node(value);

            if (head == null) {
                head = newNode;
                return;
            }

            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }

            temp.next = newNode;
        }

        // Delete a node by value
        void deleteByValue(int value) {
            if (head == null) return;

            // If head is the node to delete
            if (head.data == value) {
                head = head.next;
                return;
            }

            Node temp = head;
            Node prev = null;

            while (temp != null && temp.data != value) {
                prev = temp;
                temp = temp.next;
            }

            // Value not found
            if (temp == null) return;

            // Remove the node
            prev.next = temp.next;
        }

        // Display the list
        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.println("NULL");
        }

        // Freeing memory is automatic in Java (Garbage Collected)
    }

    // Main method to test the list
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);

        System.out.print("Linked List: ");
        list.display();

        list.deleteByValue(20);

        System.out.print("After deleting 20: ");
        list.display();
    }
}

