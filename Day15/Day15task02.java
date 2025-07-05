public class Day15task02 {
    static class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int val) { this.val = val; }
    }

    static class BinarySearchTree {
        TreeNode root;

        public void insertIfEmpty(int val) {
            if (root == null) {
                root = new TreeNode(val);
                System.out.println(val + " inserted as root.");
            } else {
                System.out.println("Tree not empty.");
            }
        }

        public void insertIfNotEmpty(int val) {
            if (root == null) {
                System.out.println("Tree empty. Use insertIfEmpty.");
                return;
            }
            insertNode(root, val);
        }

        private void insertNode(TreeNode node, int val) {
            if (val < node.val) {
                if (node.left == null) node.left = new TreeNode(val);
                else insertNode(node.left, val);
            } else if (val > node.val) {
                if (node.right == null) node.right = new TreeNode(val);
                else insertNode(node.right, val);
            }
        }
    }

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insertIfEmpty(10);
        bst.insertIfNotEmpty(5);
    }
}

