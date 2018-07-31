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

    // sets up a pointer to the root node then always moves left
    // to get to the smallest value in the tree and returns it.
    public int min() {
        TreeNode current = this.root;
        while (current.left != null) {
            current = current.left;
        }
        return current.data;
    }

    // same as min, but move right to get maximum value
    public int max() {
        TreeNode current = this.root;
        while (current.right != null) {
            current = current.right;
        }
        return current.data;
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

    private StringBuilder inOrder(StringBuilder builder, TreeNode current) {
        if (current == null) {
            return builder;
        }

        inOrder(builder, current.left);
        builder.append(current.data + " ");
        inOrder(builder, current.right);

        return builder;
    }

    private StringBuilder postOrder(StringBuilder builder, TreeNode current) {
        if (current == null) {
            return builder;
        }

        preOrder(builder, current.left);
        preOrder(builder, current.right);
        builder.append(current.data + " ");

        return builder;
    }

    public boolean contains(int value) {
        return this.contains(value, this.root);
    }

    private boolean contains(int value, TreeNode node) {
        if (node == null) {
            return false;
        }

        if (node.data == value) {
            return true;
        }

        boolean wasOnLeft = contains(value, node.left);
        boolean wasOnRight = contains(value, node.right);
        return wasOnLeft || wasOnRight;
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

    public int size (BinarySearchTree testTree) {

        String string = testTree.toString();
        String[] arrayOfString = string.split(" ");
        return arrayOfString.length;
    }

    public int minForUnorganized() {
        String string = BinarySearchTree.this.toString();
        String[] arrayOfString = string.split(" ");
        int minimum = Integer.parseInt(arrayOfString[0]);
        for (int row = 0; row < arrayOfString.length; row++) {
            if (minimum > Integer.parseInt(arrayOfString[row])) {
                minimum = Integer.parseInt(arrayOfString[row]);
            }
        }
        return minimum;
    }

    public boolean containsTwo(int value) {
        boolean run = true;
        String string = BinarySearchTree.this.toString();
        String[] arrayOfString = string.split(" ");
        for (int row = 0; row < arrayOfString.length; row++) {
            if (Integer.parseInt(arrayOfString[row]) == value) {
                run = true;
            } else {
                run = false;
            }
        }
        return run;
    }

    public void fizzBuzz() { fizzBuzz(root); }
    public void fizzBuzzNonRecursive() {fizzBuzzNonRecursive(BinarySearchTree.this);}
}

