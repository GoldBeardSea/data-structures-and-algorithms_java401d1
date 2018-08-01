package tree;

public class main {
    public static void main(String[] args) {
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
        treeTest.breadthFirstTraversal();



    }
}
