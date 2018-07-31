package tree;

public class main {
    public static void main(String[] args) {
        BinarySearchTree treeTest = new BinarySearchTree();
        treeTest.add(50);
        treeTest.add(25);
        treeTest.add(75);
        treeTest.add(15);
        treeTest.add(30);
        treeTest.add(16);
        treeTest.add(86);
        treeTest.add(45);
        treeTest.add(99);
        treeTest.add(100);
        treeTest.add(63);
        treeTest.add(19);
        treeTest.add(33);
        treeTest.add(37);
        treeTest.add(1);
        treeTest.add(2);
        treeTest.add(3);
        treeTest.add(4);
        treeTest.add(5);
        treeTest.add(6);
        treeTest.fizzBuzz();
        System.out.println(treeTest.toString());
        treeTest.fizzBuzzNonRecursive();
        System.out.println(treeTest.size(treeTest));
        System.out.println(treeTest.min());
        System.out.println(treeTest.minForUnorganized());
        System.out.println(treeTest.containsTwo(7));
        System.out.println(treeTest.contains(6));


    }
}
