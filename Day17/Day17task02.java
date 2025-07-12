public class Day17task02 {

    static final boolean RED = true;
    static final boolean BLACK = false;

    // Node class
    class Node {
        int data;
        boolean color;
        Node left, right, parent;

        Node(int data) {
            this.data = data;
            this.color = RED;
        }
    }

    private Node root;

    // Insert method
    public void insert(int data) {
        Node newNode = new Node(data);
        root = bstInsert(root, newNode);
        fixViolation(newNode);
    }

    // Standard BST insertion
    private Node bstInsert(Node root, Node node) {
        if (root == null) return node;

        if (node.data < root.data) {
            root.left = bstInsert(root.left, node);
            root.left.parent = root;
        } else if (node.data > root.data) {
            root.right = bstInsert(root.right, node);
            root.right.parent = root;
        }

        return root;
    }

    // Fix red-black tree violations
    private void fixViolation(Node node) {
        Node parent, grandparent;

        while (node != root && node.parent.color == RED) {
            parent = node.parent;
            grandparent = parent.parent;

            // Parent is left child of grandparent
            if (parent == grandparent.left) {
                Node uncle = grandparent.right;

                // Case 1: Uncle is red
                if (uncle != null && uncle.color == RED) {
                    parent.color = BLACK;
                    uncle.color = BLACK;
                    grandparent.color = RED;
                    node = grandparent;
                } else {
                    // Case 2: node is right child
                    if (node == parent.right) {
                        node = parent;
                        rotateLeft(node);
                    }

                    // Case 3: node is left child
                    parent.color = BLACK;
                    grandparent.color = RED;
                    rotateRight(grandparent);
                }
            } else {
                // Parent is right child of grandparent (mirror case)
                Node uncle = grandparent.left;

                if (uncle != null && uncle.color == RED) {
                    parent.color = BLACK;
                    uncle.color = BLACK;
                    grandparent.color = RED;
                    node = grandparent;
                } else {
                    if (node == parent.left) {
                        node = parent;
                        rotateRight(node);
                    }

                    parent.color = BLACK;
                    grandparent.color = RED;
                    rotateLeft(grandparent);
                }
            }
        }

        root.color = BLACK;
    }

    // Left rotation
    private void rotateLeft(Node node) {
        Node rightChild = node.right;
        node.right = rightChild.left;

        if (rightChild.left != null)
            rightChild.left.parent = node;

        rightChild.parent = node.parent;

        if (node.parent == null)
            root = rightChild;
        else if (node == node.parent.left)
            node.parent.left = rightChild;
        else
            node.parent.right = rightChild;

        rightChild.left = node;
        node.parent = rightChild;
    }

    // Right rotation
    private void rotateRight(Node node) {
        Node leftChild = node.left;
        node.left = leftChild.right;

        if (leftChild.right != null)
            leftChild.right.parent = node;

        leftChild.parent = node.parent;

        if (node.parent == null)
            root = leftChild;
        else if (node == node.parent.left)
            node.parent.left = leftChild;
        else
            node.parent.right = leftChild;

        leftChild.right = node;
        node.parent = leftChild;
    }

    // In-order traversal
    public void printTree() {
        inOrder(root);
        System.out.println();
    }

    private void inOrder(Node node) {
        if (node != null) {
            inOrder(node.left);
            System.out.print(node.data + "(" + (node.color ? "R" : "B") + ") ");
            inOrder(node.right);
        }
    }

    // Main method to test
    public static void main(String[] args) {
        Day17task02 tree = new Day17task02();

        int[] elements = {10, 20, 30, 15, 25, 5};
        for (int num : elements) {
            tree.insert(num);
        }

        System.out.println("Red-Black Tree (in-order):");
        tree.printTree();
    }
}
