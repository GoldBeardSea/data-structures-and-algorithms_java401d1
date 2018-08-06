import apple.laf.JRSUIUtils;
import org.junit.Test;

import static org.junit.Assert.*;

public class BinaryTreeTest {

    @Test
    public void flipBinary() {
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
        System.out.println(treeTest.getRoot().data);
        System.out.println(treeTest.getRoot().left.data);
        System.out.println(treeTest.getRoot().right.data);
        System.out.println(treeTest.toString());
        TreeNode actual = treeTest.flipBinary(treeTest.root);
        System.out.println(treeTest.getRoot().data);
        System.out.println(treeTest.getRoot().left.data);
        System.out.println(treeTest.getRoot().right.data);
        System.out.println(treeTest.toString());
        assertEquals(7, actual.left.left.getData());
    }

    @Test
    public void flipBinaryUneven() {
        BinaryTree treeTest = new BinaryTree();
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(4);
        TreeNode n5 = new TreeNode(5);
        TreeNode n6 = new TreeNode(6);
        TreeNode n7 = new TreeNode(7);
        TreeNode n8 = new TreeNode(8);

        treeTest.root = n1;
        n1.left = n2;
        n2.left = n4;
        n2.right = n5;
        n5.left = n8;

        n1.right = n3;
        n3.left = n6;
        n3.right = n7;
        System.out.println(treeTest.getRoot().data);
        System.out.println(treeTest.getRoot().left.data);
        System.out.println(treeTest.getRoot().right.data);
        System.out.println(treeTest.toString());
        TreeNode actual = treeTest.flipBinary(treeTest.root);
        System.out.println(treeTest.getRoot().data);
        System.out.println(treeTest.getRoot().left.data);
        System.out.println(treeTest.getRoot().right.data);
        System.out.println(treeTest.toString());
        assertEquals(8, actual.right.left.right.getData());
    }
    @Test
    public void flipBinaryEmpty() {
        BinaryTree treeTest = new BinaryTree();
        treeTest.flipBinary();
        assertNull(treeTest.root);
    }
}