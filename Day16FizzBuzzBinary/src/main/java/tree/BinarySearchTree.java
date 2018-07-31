package tree;

public class BinarySearchTree {
    private TreeNode root;

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

    public void fizzBuzz(TreeNode fizzyTreeNode) {
        if (fizzyTreeNode == null) {
            return;
        }
        if (fizzyTreeNode.getData() % 15 == 0) {
            System.out.print("FizzBuzz" + " ");
        } else if (fizzyTreeNode.getData() % 3 == 0) {
            System.out.print("Fizz" + " ");
        } else if (fizzyTreeNode.getData() % 5 == 0) {
            System.out.print("Buzz" + " ");
        } else {
            System.out.print(fizzyTreeNode.getData() + " ");
        }
        fizzBuzz(fizzyTreeNode.left);
        fizzBuzz(fizzyTreeNode.right);
    }


    public void fizzBuzzNonRecursive(BinarySearchTree iterate) {
        // FizzBuzz based on the Morris Traversal method.
        TreeNode traverserNode = iterate.root;
        while (traverserNode != null) {
            if (traverserNode.left == null) {
                if (traverserNode.getData() % 15 == 0) {
                    System.out.print("FizzBuzz" + " ");
                } else if (traverserNode.getData() % 3 == 0) {
                    System.out.print("Fizz" + " ");
                } else if (traverserNode.getData() % 5 == 0) {
                    System.out.print("Buzz" + " ");
                } else {
                    System.out.print(traverserNode.getData() + " ");
                }
                traverserNode = traverserNode.right;
            } else {
                TreeNode current = traverserNode.left;
                while (current.right != null && current.right != traverserNode) {
                    current = current.right;
                }

                if (current.right == traverserNode) {
                    current.right = null;
                    traverserNode = traverserNode.right;
                } else {
                    if (traverserNode.getData() % 15 == 0) {
                        System.out.print("FizzBuzz" + " ");
                    } else if (traverserNode.getData() % 3 == 0) {
                        System.out.print("Fizz" + " ");
                    } else if (traverserNode.getData() % 5 == 0) {
                        System.out.print("Buzz" + " ");
                    } else {
                        System.out.print(traverserNode.getData() + " ");
                    }
                    current.right = traverserNode;
                    traverserNode = traverserNode.left;
                }
            }
        }
    }

    //not working quite yet
    public void fizzBuzzOrder(TreeNode fizzyTreeNode) {
        if (fizzyTreeNode == null) {
            return;
        }
        fizzBuzz(fizzyTreeNode.left);

        if (fizzyTreeNode.getData() % 15 == 0) {
            System.out.print("FizzBuzz" + " ");
        } else if (fizzyTreeNode.getData() % 3 == 0) {
            System.out.print("Fizz" + " ");
        } else if (fizzyTreeNode.getData() % 5 == 0) {
            System.out.print("Buzz" + " ");
        } else {
            System.out.print(fizzyTreeNode.getData() + " ");
        }

        fizzBuzz(fizzyTreeNode.right);
    }

    public void fizzBuzz() { fizzBuzz(root); }
    public void fizzBuzzNonRecursive() {fizzBuzzNonRecursive(BinarySearchTree.this);}
    public void fizzBuzzOrder() { fizzBuzzOrder(root);}
}

