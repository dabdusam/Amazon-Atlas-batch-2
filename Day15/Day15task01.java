// TreeNode class represents a node in the tree
class TreeNode {
    int value;          // The value of the node
    TreeNode left;      // Left child
    TreeNode right;     // Right child

    // Constructor to create a node with a specific value
    TreeNode(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }
}

// Main class to build and display the tree
public class Day15task01 {
    public static void main(String[] args) {
        // Create the root node with value 1
        TreeNode root = new TreeNode(1);

        // Create and attach children
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        // Display tree structure using preorder traversal
        System.out.print("Preorder traversal of tree: ");
        preorder(root);
    }

    // A simple method to print the tree in preorder (Root, Left, Right)
    public static void preorder(TreeNode node) {
        if (node == null) return;

        System.out.print(node.value + " ");
        preorder(node.left);
        preorder(node.right);
    }
}




