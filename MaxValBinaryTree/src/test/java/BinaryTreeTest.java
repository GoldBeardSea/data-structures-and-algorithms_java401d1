import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeTest {

    @Test
    void findMax() {
        BinaryTree treeTest = new BinaryTree();
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
        int actual = treeTest.findMax(treeTest.root);
        assertEquals(7, actual);
    }

    @Test
    void findMaxLargerValues() {
        BinaryTree treeTest = new BinaryTree();
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(150);
        TreeNode n3 = new TreeNode(40);
        TreeNode n4 = new TreeNode(4);
        TreeNode n5 = new TreeNode(100);
        TreeNode n6 = new TreeNode(6);
        TreeNode n7 = new TreeNode(125);

        treeTest.root = n1;
        n1.left = n2;
        n2.left = n4;
        n2.right = n5;

        n1.right = n3;
        n3.left = n6;
        n3.right = n7;
        int actual = treeTest.findMax(treeTest.root);
        assertEquals(150, actual);
    }

    @Test
    void findMaxEmptyList() {
        BinaryTree treeTest = new BinaryTree();
        int actual = treeTest.findMax(treeTest.root);
        assertEquals(Integer.MIN_VALUE, actual);
    }

    @Test
    void findMaxAllNegative() {
        BinaryTree treeTest = new BinaryTree();
        TreeNode n1 = new TreeNode(-5);
        TreeNode n2 = new TreeNode(-25);
        TreeNode n3 = new TreeNode(-500);
        TreeNode n4 = new TreeNode(-19);
        TreeNode n5 = new TreeNode(-15);
        TreeNode n6 = new TreeNode(-14);
        TreeNode n7 = new TreeNode(-1);

        treeTest.root = n1;
        n1.left = n2;
        n2.left = n4;
        n2.right = n5;

        n1.right = n3;
        n3.left = n6;
        n3.right = n7;
        int actual = treeTest.findMax(treeTest.root);
        assertEquals(-1, actual);
        System.out.println(treeTest.toString());
    }

}