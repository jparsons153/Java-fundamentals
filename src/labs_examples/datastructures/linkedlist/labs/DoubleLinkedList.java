package labs_examples.datastructures.linkedlist.labs;

import labs_examples.datastructures.linkedlist.examples.Node;

/**
 *      LinkedLists - Exercise_02
 *
 *      Please create your own custom doubly-LinkedList from start to finish :) You got this!
 */

public class DoubleLinkedList<T> {

    // head and tail variables
    private DoubleNode head;
    private DoubleNode tail;

    public DoubleLinkedList(T... data) {

        if (data.length < 1) {
            // instantiate an empty LinkedList if no data elements passed in
            head = null;
            tail = null;

        } else {
            add(data);
        }
    }

    public void add(T[] data) {
        DoubleNode newNode = new DoubleNode(data);

        // if "head" is null, create new root node
        if (head == null) {
            head = newNode;
            head.previous = null;
            tail.next = null;

            // else add new Node to the end of the list
        } else {
            tail.next = newNode;
            newNode.previous = tail;
            tail = newNode;
            tail.next = null;

        }
    }

    public void remove(int index, DoubleNode previous) {

        // reference the "head" node
        DoubleNode iterator = head;

        if (index == 0) {

            // delete the first node in the list
            head = head.next;

        } else if (index < size()){

            // delete a node in the middle of the list
            try {
                int i = 0;

                // iterate until index is reached
                while (i != index) {
                    previous = iterator;
                    iterator = iterator.next;
                    i++;
                }

                // link previous node to the node after the current
                previous.next = iterator.next;
            } catch (NullPointerException ex) {
                System.out.println("Null pointer exception index out of range");
            }

        } else {
        // if we hit this "else" block, it means the user wants to delete the node at the end of the list
        tail = null;
        }
    }

    public int size() {
        int count = 0;
        DoubleNode iterator = head;

        // iterate through list
        while (iterator != null) {
            count++;
            iterator = iterator.next;
        }

        return count;
    }
}