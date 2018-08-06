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
        return preOrder(builder, this.root).toString();
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

    private boolean isIdentical (TreeNode treeOne, TreeNode treeTwo) {
        if (treeOne == null && treeTwo == null) {
            return true;
        }
        if (treeOne != null && treeTwo != null) {
            return (treeOne.data == treeTwo.data && isIdentical(treeOne.left, treeTwo.left) && isIdentical(treeOne
                    .right, treeTwo.right));
        }
        return false;
    }

    public boolean isIdentical (BinaryTree Tree) {
        return isIdentical(this.root, Tree.root);
    }



}