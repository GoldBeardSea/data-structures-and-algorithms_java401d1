package tree;

import java.util.LinkedList;
import java.util.Queue;

public class BreadthTraversalTree {
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

    // moving through the tree until we find a free
    // spot to place the new value.
    private void add(int value, TreeNode current) {
        // found a proper spot on the left!
        if (current.left == null && value <= current.data) {
            current.left = new TreeNode(value);
            return;
        }

        // found a proper spot on the right!
        if (current.right == null && value > current.data) {
            current.right = new TreeNode(value);
            return;
        }

        // recursive case: move through the tree
        // move left and right through the tree comparing values.
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

    public int breadthFirstTraversal() {
        if (this.root == null) {
            System.out.println("List is Empty");
            return 0;
        }
        Queue<TreeNode> treeNodeQueue = new LinkedList<TreeNode>();
        treeNodeQueue.add(root);
        TreeNode endNode = root;
        while (!treeNodeQueue.isEmpty()) {
            TreeNode traversingNode = treeNodeQueue.poll();
            System.out.print(traversingNode.getData() + " ");

            if (traversingNode.left != null) {
                treeNodeQueue.add(traversingNode.left);
            }
            if (traversingNode.right != null) {
                treeNodeQueue.add(traversingNode.right);
            }
            endNode = traversingNode;
        }
        return endNode.getData();
    }
}

