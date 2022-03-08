package labs_examples.datastructures.trees.labs;

public class Node {
        Node left;
        Node right;
        int data;
        int height;

        public Node(int data) {
            this.data = data;
            this.height = 1;
        }
}
