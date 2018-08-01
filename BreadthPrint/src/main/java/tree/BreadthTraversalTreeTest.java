package tree;

import static org.junit.jupiter.api.Assertions.*;

class BreadthTraversalTreeTest {

    @org.junit.jupiter.api.Test
    void breadthFirstTraversal() {
        BreadthTraversalTree treeTest = new BreadthTraversalTree();
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(4);
        TreeNode n5 = new TreeNode(5);
        TreeNode n6 = new TreeNode(6);
        TreeNode n7 = new TreeNode(7);

        treeTest.root = n1;
        n1.left = n2;
        n2.left = n4;
        n2.right = n5;

        n1.right = n3;
        n3.left = n6;
        n3.right = n7;
        int actual = treeTest.breadthFirstTraversal();
        assertEquals(7, actual);
    }

    @org.junit.jupiter.api.Test
    void breadthFirstTraversalSingleNode() {
        BreadthTraversalTree treeTest = new BreadthTraversalTree();
        TreeNode n1 = new TreeNode(1);

        treeTest.root = n1;
        int actual = treeTest.breadthFirstTraversal();
        assertEquals(1, actual);
    }
    @org.junit.jupiter.api.Test
    void breadthFirstTraversalUneven() {
        BreadthTraversalTree treeTest = new BreadthTraversalTree();
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        TreeNode n5 = new TreeNode(5);
        TreeNode n6 = new TreeNode(6);

        treeTest.root = n1;
        n1.left = n2;
        n2.right = n5;

        n1.right = n3;
        n3.left = n6;
        int actual = treeTest.breadthFirstTraversal();
        assertEquals(6, actual);
    }
    @org.junit.jupiter.api.Test
    void breadthFirstTraversalEmpty() {
        BreadthTraversalTree treeTest = new BreadthTraversalTree();
        int actual = treeTest.breadthFirstTraversal();
        assertEquals(0, actual);
    }
}