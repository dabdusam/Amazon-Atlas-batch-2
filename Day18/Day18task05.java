import java.util.*;

public class Day18task05 {

    // Binary tree node structure
    static class Node {
        int data;
        Node left, right;

        Node(int val) {
            data = val;
            left = right = null;
        }
    }

    // Method to print corner nodes at each level
    public static void printCornerNodes(Node root) {
        if (root == null) return;

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int n = queue.size(); // number of nodes at current level

            for (int i = 0; i < n; i++) {
                Node temp = queue.poll();

                // Check if it's the first or last node at this level
                if (i == 0 || i == n - 1) {
                    System.out.print(temp.data + " ");
                }

                if (temp.left != null) queue.add(temp.left);
                if (temp.right != null) queue.add(temp.right);
            }

            System.out.println(); // new line for each level
        }
    }


    public static void main(String[] args) {
        Node root = new Node(1);

        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        root.left.left.left = new Node(8);
        root.left.right.left = new Node(10);
        root.left.right.right = new Node(11);

        root.right.left.left = new Node(12);
        root.right.left.right = new Node(13);
        root.right.right.left = new Node(14);
        root.right.right.right = new Node(15);

        // Call the method
        printCornerNodes(root);
    }
}

