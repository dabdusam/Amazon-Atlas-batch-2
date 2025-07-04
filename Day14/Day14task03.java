public class Day14task03 {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    // Traverse and display the list
    static void traverse(Node head) {
        if (head == null) return;
        Node curr = head;
        do {
            System.out.print(curr.data + " ");
            curr = curr.next;
        } while (curr != head);
        System.out.println();
    }

    // Delete node by value
    static Node delete(Node head, int key) {
        if (head == null) return null;

        // Special case: deleting head
        if (head.data == key) {
            if (head.next == head) return null; // only one node

            // Find last node to update circular link
            Node tail = head;
            while (tail.next != head) tail = tail.next;

            tail.next = head.next;
            return head.next;
        }

        // Deleting non-head node
        Node curr = head;
        while (curr.next != head) {
            if (curr.next.data == key) {
                curr.next = curr.next.next;
                return head;
            }
            curr = curr.next;
        }

        System.out.println("Node not found: " + key);
        return head;
    }

    public static void main(String[] args) {
        // Create circular linked list: 10 → 20 → 30 → 40 → (back to 10)
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = head; // circular link

        System.out.println("Original List:");
        traverse(head);

        // Delete node with value 30
        head = delete(head, 30);

        System.out.println("After Deleting 30:");
        traverse(head);
    }
}



