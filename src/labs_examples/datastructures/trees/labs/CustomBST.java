package labs_examples.datastructures.trees.labs;

public class CustomBST {
    // TO DO
    // Refractor & change comments

        Node root;
        int size;

        CustomBST(int ...data) {
            // initialise empty tree if no data passed
            if (data.length < 1) {
                root = null;
            } else {
                for (int i = 0; i < data.length; i++) {
                    insert(data[i]);
                }
            }
        }

        public void insert(int data) {
            // if the tree is empty, create a new root node
            if(root == null){
                root = new Node(data);
                size++;
            }
            // use recursive insert() method to pass the data and root node
            else {
                insert(data, root);
            }
        }

        private Node insert(int data, Node node) {

            // create new root node
            if (node == null) {
                node = new Node(data);
                size++;
            }

            // left Child of tree
            if (data < node.data) {
                // recursive - passing left child Node
                node.left = insert(data, node.left);
            }
            // right Child of tree
            else if (data > node.data){
                // recursive - passing right child Node
                node.right = insert(data, node.right);
            }
            // prevent duplicates
            else {
                return node;
            }

            // check if tree needs to be rebalanced
            return rebalanceInsert(node, data);
        }

        // Rebalance after Insert
        private Node rebalanceInsert(Node node, int data) {

            // get heights
            int leftHeight = height(node.left);
            int rightHeight = height(node.right);

            // Find largest child height and update height
            node.height = 1 + Math.max(leftHeight, rightHeight);

            // compute balance factor
            int balanceFactor = leftHeight - rightHeight;

            // Re-balance depending on whether left or right is larger
            if (balanceFactor > 1 && data < node.left.data) {
                return rotateRight(node);
            }

            if (balanceFactor < -1 && data > node.right.data) {
                return rotateLeft(node);
            }
            // leftChild is bigger and new node is greater than leftChild
            if (balanceFactor > 1 && data > node.left.data) {
                // rotate left 
                node.left = rotateLeft(node.left);
                // then do simple rotation
                return rotateRight(node);
            }
            // rightChild is bigger and new node is less than rightChild
            if (balanceFactor < -1 && data < node.right.data) {
                // rotate rightChild first to get to simple case
                node.right = rotateRight(node.right);
                // then do simple rotation
                return rotateLeft(node);
            }

            return node;
        }

        private Node rotateRight(Node node) {
            // copy node's leftChild child (which will become the root node of this subtree)
            Node child = node.left;
            // make a backup of right child (the right child is about to be overwritten)
            Node formerRightChild = child.right;

            // rotate - set the new right child to the node we're inserting
            child.right = node;
            // set the left child to what was formerly the right child
            node.left = formerRightChild;

            // update heights
            int leftHeight = height(node.left);
            int rightHeight = height(node.right);
            node.height = 1 + Math.max(leftHeight, rightHeight);

            leftHeight = height(child.left);
            rightHeight = height(child.right);
            child.height = 1 + Math.max(leftHeight, rightHeight);

            return child;
        }

        private Node rotateLeft(Node node) {
            // copy node's leftChild child (which will become the root node of this subtree)
            Node child = node.right;
            // make a backup of right child (the right child is about to be overwritten)
            Node formerLeftChild = child.left;

            // rotate - set the new right child to the node we're inserting
            child.left = node;
            // set the left child to what was formerly the right child
            node.right = formerLeftChild;

            // update heights
            int leftHeight = height(node.left);
            int rightHeight = height(node.right);
            node.height = 1 + Math.max(leftHeight, rightHeight);

            leftHeight = height(child.left);
            rightHeight = height(child.right);
            child.height = 1 + Math.max(leftHeight, rightHeight);

            return child;
        }

    boolean search(int target) {
        // call the search helper (recursive) method
        return search(target, root);
    }

    // Search tree for target value
    boolean search(int target, Node node) {
        // make sure end of branch hasn't been reached
        if (node != null) {
            if (node.data == target) {
                // target found - return true - it does exist
                return true;
            }
            // follow the leftChild branch
            else if (target < node.data) {
                return search(target, node.left);
            }
            // follow the rightChild branch
            else if (target > node.data) {
                return search(target, node.right);
            }
        }

        return false;
    }

    // Remove element
    public void remove(int target) {


        // make sure node exists - if it doesn't
        if (!search(target)) {
            return;
        }

        // start the recursive helper method
        System.out.println("removing " + target);
        root = remove(target, root);
    }

    // Recursively removes a value from the tree
    private Node remove(int target, Node node) {

        // move recursively leftChild
        if (target < node.data) {
            node.left = remove(target, node.left);
        }
        // move recursively rightChild
        else if (target > node.data){
            node.right = remove(target, node.right);
        }
        // currently at the target Node
        else {
            // currently at a leaf Node
            if (node.left == null && node.right == null) {
                // delete current Node
                size--;
                return null;
            }
            // no leftChild branch
            else if (node.left == null) {
                // delete current Node and link to rightChild branch
                size--;
                return node.right;
            }
            // no rightChild branch
            else if (node.right == null) {
                // delete current Node and link to leftChild branch
                size--;
                return node.left;
            }
            // two branches
            else {
                // get the smallest node that's bigger than leftChild node
                // swap its value to the current node position then remove the old node

                // start at the top of the rightChild branch
                Node smallest = node.right;

                // iterate down the leftChild to the smallest node
                while (smallest.left != null) {
                    smallest = smallest.left;
                }

                // swap current data with smallest
                int temp = node.data;
                node.data = smallest.data;
                smallest.data = temp;


                // remove old smallest node
                node.right = remove(target, node.right);
            }
        }
        return rebalanceRemove(node);
    }

    private Node rebalanceRemove(Node node) {
        // update height

        int leftHeight = height(node.left);
        int rightHeight = height(node.right);
        node.height = 1 + Math.max(leftHeight, rightHeight);

        // calculate balance factor of node
        int balanceFactor = leftHeight - rightHeight;

        // calculate leftChild balance
        leftHeight = 0;
        rightHeight = 0;
        if (node.left != null) {
            leftHeight = height(node.left.left);
            rightHeight = height(node.left.right);
        }
        int balanceLeft = leftHeight - rightHeight;


        // calculate rightChild balance
        leftHeight = 0;
        rightHeight = 0;
        if (node.right != null) {
            leftHeight = height(node.right.left);
            rightHeight = height(node.right.right);
        }
        int balanceRight = leftHeight - rightHeight;

        // rebalance
        if (balanceFactor > 1 && balanceLeft >= 0) {
            return rotateRight(node);
        }
        if (balanceFactor > 1 && balanceLeft < 0) {
            node.left = rotateLeft(node.left);
            return rotateRight(node);
        }
        if (balanceFactor < -1 && balanceRight <= 0) {
            node =  rotateLeft(node);
            return node;
        }
        if (balanceFactor < -1 && balanceRight > 0) {
            node.right = rotateRight(node.right);
            return rotateLeft(node);
        }

        return node;
    }

    public void printInorderRecursive(Node node) {
        if (node == null)
            return;
        // first, recursively traverse all the way down the left side of the tree
        printInorderRecursive(node.left);
        // then print out the data at each node
        System.out.print(node.data + " ");
        // then, recurse down the right side (of each subtree)
        printInorderRecursive(node.right);
    }

    public void printPreorderRecursive(Node node) {
        if (node == null) return;
        // print out the data first
        System.out.print(node.data + " ");
        // recurse down the left tree
        printPreorderRecursive(node.left);
        // recurse down the right tree
        printPreorderRecursive(node.right);
    }

    public void printPostorderRecursive(Node node) {
        if (node == null)
            return;
        // first recur down the left subtree
        printPostorderRecursive(node.left);
        // then recur down then right subtree
        printPostorderRecursive(node.right);
        // now print the data at each node
        System.out.print(node.data + " ");
    }

    private int height(Node node) {
            if (node == null) {
                return 0;
            }
            return node.height;
        }

        public boolean isBalanced() {
            // get balance factor
            int balanceFactor = height(root.left) - height(root.right);

            // determine with the sides are within 1 level of each other
            return Math.abs(balanceFactor) <= 1;
        }
    }