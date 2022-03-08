package labs_examples.datastructures.trees.labs;

/*
    Trees: Exercise_01

    Please demonstrate how to create a custom Binary Search Tree (BST). Using your custom BST, demonstrate how to:

        1.) Create a new CustomBST
        2.) Insert new elements
        3.) Retrieve elements
        4.) Update elements
        5.) Delete elements
        6.) Print elements (Bonus: try in-order traversal, pre-order traversal, post-order traversal)
        7.) Keep the tree well balanced

 */

class Node {
    Node left;
    Node right;
    int data;
    int height;

    public Node(int data) {
        this.data = data;
        this.height = 1;
    }
}

    class customBST {
        Node root;
        int size;

        customBST(int ...data) {
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
            // start the recursive insert() method, passing the data and the "root" node
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

            // move to leftChild of tree
            if (data < node.data) {
                // recursive call - passing the left child Node (effectively traversing left)
                node.left = insert(data, node.left);
            }
            // move to rightChild of tree
            else if (data > node.data){
                // recursive call - passing the left child Node (effectively traversing left)
                node.right = insert(data, node.right);
            }
            // prevent duplicates
            else {
                return node;
            }

            // after every insert we'll check to see if the tree needs to be rebalanced
            return rebalanceInsert(node, data);
        }

        // Rebalance after Insert

        private Node rebalanceInsert(Node node, int data) {

            // get heights of child nodes
            int leftHeight = height(node.left);
            int rightHeight = height(node.right);

            // update height of node to the greatest of its child heights
            node.height = 1 + Math.max(leftHeight, rightHeight);

            // calculate balance factor of node
            int balanceFactor = leftHeight - rightHeight;

            // leftChild is bigger and new node is less than leftChild - we need to
            /// move the current node.leftChild so that
            // it will become node.rightChild and the new node that we're
            // inserting will become node.leftChild
            if (balanceFactor > 1 && data < node.left.data) {
                return rotateRight(node);
            }
            // rightChild is bigger and new node is greater than rightChild - inverse of
            // above section - need to move
            // current right child to left child because the node we're inserting is larger
            // than right chuild
            if (balanceFactor < -1 && data > node.right.data) {
                return rotateLeft(node);
            }
            // leftChild is bigger and new node is greater than leftChild
            if (balanceFactor > 1 && data > node.left.data) {
                // rotate leftChild first to get to simple case
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