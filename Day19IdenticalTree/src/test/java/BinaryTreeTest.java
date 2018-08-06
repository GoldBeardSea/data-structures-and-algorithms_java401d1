import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeTest {

    @Test
    void isIdentical() {
        BinaryTree treeTest = new BinaryTree();
        treeTest.add(50);
        treeTest.add(25);
        treeTest.add(75);
        treeTest.add(15);
        treeTest.add(30);
        BinaryTree treeTestTwo = new BinaryTree();
        treeTestTwo.add(50);
        treeTestTwo.add(25);
        treeTestTwo.add(75);
        treeTestTwo.add(15);
        treeTestTwo.add(30);
        System.out.println(treeTest.isIdentical(treeTestTwo));
        assertTrue(treeTest.isIdentical(treeTestTwo));
    }

    @Test
    void isIdenticalFalseNode() {
        BinaryTree treeTest = new BinaryTree();
        treeTest.add(50);
        treeTest.add(25);
        treeTest.add(75);
        treeTest.add(15);
        treeTest.add(30);
        BinaryTree treeTestTwo = new BinaryTree();
        treeTestTwo.add(50);
        treeTestTwo.add(25);
        treeTestTwo.add(75);
        treeTestTwo.add(15);
        treeTestTwo.add(30);
        treeTestTwo.add(30);
        System.out.println(treeTest.isIdentical(treeTestTwo));
        assertFalse(treeTest.isIdentical(treeTestTwo));
    }

    @Test
    void isIdenticalFalseValues() {
        BinaryTree treeTest = new BinaryTree();
        treeTest.add(50);
        treeTest.add(25);
        treeTest.add(75);
        treeTest.add(15);
        treeTest.add(30);
        BinaryTree treeTestTwo = new BinaryTree();
        treeTestTwo.add(50);
        treeTestTwo.add(25);
        treeTestTwo.add(75);
        treeTestTwo.add(15);
        treeTestTwo.add(-10);
        System.out.println(treeTest.isIdentical(treeTestTwo));
        assertFalse(treeTest.isIdentical(treeTestTwo));
    }

    @Test
    void isIdenticalTrueEmpty() {
        BinaryTree treeTest = new BinaryTree();
        BinaryTree treeTestTwo = new BinaryTree();
        System.out.println(treeTest.isIdentical(treeTestTwo));
        assertTrue(treeTest.isIdentical(treeTestTwo));
    }

    @Test
    void isIdenticalWiredNode() {
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
        BinaryTree treeTestTwo = new BinaryTree();
        TreeNode m1 = new TreeNode(1);
        TreeNode m2 = new TreeNode(2);
        TreeNode m3 = new TreeNode(3);
        TreeNode m4 = new TreeNode(4);
        TreeNode m5 = new TreeNode(5);
        TreeNode m6 = new TreeNode(6);
        TreeNode m7 = new TreeNode(7);

        treeTestTwo.root = m1;
        m1.left = m2;
        m2.left = m4;
        m2.right = m5;

        m1.right = m3;
        m3.left = m6;
        m3.right = m7;
        assertTrue(treeTest.isIdentical(treeTestTwo));
    }

    @Test
    void isNotIdenticalWiredNodeVal() {
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
        BinaryTree treeTestTwo = new BinaryTree();
        TreeNode m1 = new TreeNode(1);
        TreeNode m2 = new TreeNode(2);
        TreeNode m3 = new TreeNode(3);
        TreeNode m4 = new TreeNode(4);
        TreeNode m5 = new TreeNode(5);
        TreeNode m6 = new TreeNode(7);
        TreeNode m7 = new TreeNode(7);

        treeTestTwo.root = m1;
        m1.left = m2;
        m2.left = m4;
        m2.right = m5;

        m1.right = m3;
        m3.left = m6;
        m3.right = m7;
        assertFalse(treeTest.isIdentical(treeTestTwo));
    }
}