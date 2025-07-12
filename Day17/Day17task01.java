class Day17task01 {

    class Node {
        int key, height;
        Node left, right;

        Node(int d) {
            key = d;
            height = 1; // New node is initially added at leaf
        }
    }

    Node root;

    // Get height of the node
    int height(Node N) {
        return (N == null) ? 0 : N.height;
    }

    // Get balance factor
    int getBalance(Node N) {
        return (N == null) ? 0 : height(N.left) - height(N.right);
    }

    // Right rotate
    Node rightRotate(Node y) {
        Node x = y.left;
        Node T2 = x.right;

        // Rotation
        x.right = y;
        y.left = T2;

        // Update heights
        y.height = Math.max(height(y.left), height(y.right)) + 1;
        x.height = Math.max(height(x.left), height(x.right)) + 1;

        return x;
    }

    // Left rotate
    Node leftRotate(Node x) {
        Node y = x.right;
        Node T2 = y.left;

        // Rotation
        y.left = x;
        x.right = T2;

        // Update heights
        x.height = Math.max(height(x.left), height(x.right)) + 1;
        y.height = Math.max(height(y.left), height(y.right)) + 1;

        return y;
    }

    // Insert node and balance the tree
    Node insert(Node node, int key) {
        // Step 1: Perform normal BST insert
        if (node == null)
            return new Node(key);

        if (key < node.key)
            node.left = insert(node.left, key);
        else if (key > node.key)
            node.right = insert(node.right, key);
        else // Duplicates not allowed
            return node;

        // Step 2: Update height
        node.height = 1 + Math.max(height(node.left), height(node.right));

        // Step 3: Get balance factor
        int balance = getBalance(node);

        // Step 4: Check and fix unbalanced cases

        // Left Left Case
        if (balance > 1 && key < node.left.key)
            return rightRotate(node);

        // Right Right Case
        if (balance < -1 && key > node.right.key)
            return leftRotate(node);

        // Left Right Case
        if (balance > 1 && key > node.left.key) {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }

        // Right Left Case
        if (balance < -1 && key < node.right.key) {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }

        // Return the node pointer
        return node;
    }

    // Public insert method
    public void insert(int key) {
        root = insert(root, key);
    }

    // In-order traversal to display tree
    void inOrder(Node node) {
        if (node != null) {
            inOrder(node.left);
            System.out.print(node.key + " ");
            inOrder(node.right);
        }
    }

    public void display() {
        System.out.print("In-order Traversal: ");
        inOrder(root);
        System.out.println();
    }

    // Main method to test
    public static void main(String[] args) {
        Day17task01 tree = new Day17task01();

        int[] values = {30, 20, 40, 10, 25, 50, 15};

        for (int val : values) {
            tree.insert(val);
        }

        tree.display(); // Should display AVL balanced tree in-order
    }
}
