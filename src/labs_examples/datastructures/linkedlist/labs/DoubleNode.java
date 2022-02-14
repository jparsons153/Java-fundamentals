package labs_examples.datastructures.linkedlist.labs;

public class DoubleNode <T> {

        // a generic variable to hold the data we want to store in the list
        T data;
        // a "link" to the "next" Node in the LinkedList
        public DoubleNode next;
        public DoubleNode previous;

        // a simple constructor that takes in data
    public DoubleNode(T data) {
            this.data = data;
            this.next = null;
            this.previous = null;
        }

        // an overloaded constructor we'll use to add Nodes to the front of the LinkedList
    public DoubleNode(T data, DoubleNode node) {
            this.data = data;
            this.next = node;
            this.previous = null;
        }

}
