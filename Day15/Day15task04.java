// Task 1: Create a Node
class Node {
    int data;
    Node left, right;

    // Constructor
    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

// Task 2 & 3: Binary Search Tree with Insert and Inorder Traversal
class BinarySearchTree {
    Node root;

    // Constructor
    BinarySearchTree() {
        root = null;
    }

    // Insert method: handles both empty and non-empty trees
    void insert(int data) {
        root = insertRec(root, data);
    }

    // Recursive insert helper
    Node insertRec(Node root, int data) {
        if (root == null) {
            root = new Node(data);
            return root;
        }

        if (data < root.data) {
            root.left = insertRec(root.left, data);
        } else if (data > root.data) {
            root.right = insertRec(root.right, data);
        }
        // If data is equal, do not insert duplicates

        return root;
    }

    // Task 3: Inorder Traversal
    void inorderTraversal() {
        inorderRec(root);
        System.out.println(); // Print newline after traversal
    }

    void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.data + " ");
            inorderRec(root.right);
        }
    }
}

// Task 4: Main Method
public class Day15task04 {
    public static void main(String[] args) {
        // Create the BST
        BinarySearchTree bst = new BinarySearchTree();

        // Insert elements
        int[] elements = {50, 30, 70, 20, 40, 60, 80};
        for (int elem : elements) {
            bst.insert(elem);
        }

        // Perform inorder traversal
        System.out.println("Inorder Traversal of BST:");
        bst.inorderTraversal();  // Output should be sorted: 20 30 40 50 60 70 80
    }
}



