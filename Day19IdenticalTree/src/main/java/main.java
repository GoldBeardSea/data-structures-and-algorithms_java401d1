public class main {
    public static void main(String[] args) {
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

    }
}
