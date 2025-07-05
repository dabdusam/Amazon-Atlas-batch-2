// Node class for the tree
class TreeNode {
    int value;
    TreeNode left, right;

    TreeNode(int item) {
        value = item;
        left = right = null;
    }
}

// Binary Search Tree operations
class BinarySearchTreeOp {
    TreeNode root;

    // Insert a value into the BST
    void insert(int value) {
        root = insertVal(root, value);
    }

    // Recursive helper for insertion
    TreeNode insertVal(TreeNode node, int value) {
        if (node == null) {
            node = new TreeNode(value);
            return node;
        }

        if (value < node.value) {
            node.left = insertVal(node.left, value);
        } else if (value > node.value) {
            node.right = insertVal(node.right, value);
        }

        return node;
    }

    // Inorder traversal (Left → Root → Right)
    void inorder() {
        inorderVal(root);
    }

    void inorderVal(TreeNode node) {
        if (node != null) {
            inorderVal(node.left);
            System.out.print(node.value + " ");
            inorderVal(node.right);
        }
    }
}

// Main class to run the program
public class Day15task01 {
    public static void main(String[] args) {
        BinarySearchTreeOp bstobj = new BinarySearchTreeOp();

        // Insert elements into BST
        bstobj.insert(10);
        bstobj.insert(50);
        bstobj.insert(400);
        bstobj.insert(70);
        bstobj.insert(5);

        // Print inorder traversal
        System.out.println("Here is the code for inorder traversal of Binary Search Tree:");
        bstobj.inorder();
    }
}



