package utils;

public class TreeNode {
    private int val;
    private TreeNode left;
    private TreeNode right;

    TreeNode() {}

    public TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    // Method to insert a node into the binary tree
    public void insert(int value) {
        if (value < this.val) {
            if (this.left != null) {
                this.left.insert(value);
            } else {
                this.left = new TreeNode(value);
            }
        } else {
            if (this.right != null) {
                this.right.insert(value);
            } else {
                this.right = new TreeNode(value);
            }
        }
    }

    // Method to display the binary tree (in-order traversal)
    public void display() {
        if (this.left != null) {
            this.left.display();
        }
        System.out.print(this.val + " ");
        if (this.right != null) {
            this.right.display();
        }
    }

    // Method to display the tree structure (pre-order traversal)
    public void displayTreeStructure() {
        displayTreeStructureHelper(this, 0);
    }

    private void displayTreeStructureHelper(TreeNode node, int level) {
        if (node == null) {
            return;
        }
        for (int i = 0; i < level; i++) {
            System.out.print("   ");
        }
        System.out.println(node.val);
        displayTreeStructureHelper(node.left, level + 1);
        displayTreeStructureHelper(node.right, level + 1);
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public TreeNode getLeft() {
        return left;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }

}
