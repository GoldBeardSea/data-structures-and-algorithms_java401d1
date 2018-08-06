import apple.laf.JRSUIUtils;

public class BinaryTree {
    public TreeNode root;

    public TreeNode getRoot() {
        return root;
    }

    public void add(int value) {
        if (this.root == null) {
            this.root = new TreeNode(value);
            return;
        }
        this.add(value, this.root);
    }

    private void add(int value, TreeNode current) {
        // found a proper spot on the left!
        if (current.left == null && value <= current.data) {
            current.left = new TreeNode(value);
            return;
        }

        if (current.right == null && value > current.data) {
            current.right = new TreeNode(value);
            return;
        }
        if (value <= current.data) {
            add(value, current.left);
        } else if (value > current.data) {
            add(value, current.right);
        }
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();
        return inOrder(builder, this.root).toString();
    }

    private StringBuilder inOrder(StringBuilder builder, TreeNode current) {
        if (current == null) {
            return builder;
        }

        inOrder(builder, current.left);
        builder.append(current.data + " ");
        inOrder(builder, current.right);

        return builder;
    }

    private StringBuilder preOrder(StringBuilder builder, TreeNode current) {
        if (current == null) {
            return builder;
        }

        builder.append(current.data + " ");
        preOrder(builder, current.left);
        preOrder(builder, current.right);

        return builder;
    }

    public void flipBinary() {
        root = flipBinary(this.root);
    }

    public TreeNode flipBinary(TreeNode head) {
        if (head == null) {
            return head;
        }
        TreeNode leftTree = flipBinary(head.left);
        TreeNode rightTree = flipBinary(head.right);
        head.left = rightTree;
        head.right = leftTree;
        return head;
    }
}
