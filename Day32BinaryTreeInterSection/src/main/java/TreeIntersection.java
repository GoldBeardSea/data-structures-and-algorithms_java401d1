import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class TreeIntersection {

    public static Set treeIntersection(BinaryTree treeOne, BinaryTree treeTwo) {
        if (treeOne.root == null || treeTwo.root == null) {
            System.out.println("List is Empty");
            return null;
        }
        Set<Integer> treeOneSet = new HashSet<>(addingToHashSet(treeOne));
        Set<Integer> treeTwoSet = new HashSet<>(addingToHashSet(treeTwo));
        treeOneSet.retainAll(treeTwoSet);
        Set<Integer> intersection = new HashSet<>(treeOneSet);
        return intersection;
    }

    private static Set addingToHashSet(BinaryTree tree) {
        Set<Integer> treeSet = new HashSet<>();
        Queue<TreeNode> treeQueue = new LinkedList<TreeNode>();
        if (tree.root == null) {
            System.out.println("List is Empty");
            return null;
        }
        treeQueue.add(tree.root);
        while (!treeQueue.isEmpty()) {
            TreeNode traversingNode = treeQueue.poll();
            Integer addNodeValue = traversingNode.data;
            treeSet.add(addNodeValue);

            if (traversingNode.left != null) {
                treeQueue.add(traversingNode.left);
            }
            if (traversingNode.right != null) {
                treeQueue.add(traversingNode.right);
            }
        }
        return treeSet;
    }
}
