package labs_examples.datastructures.linkedlist.labs;
import labs_examples.datastructures.linkedlist.examples.Node;

import java.util.LinkedList;
import java.util.NoSuchElementException;

/**
 *      LinkedLists - Exercise_02
 *
 *      Write your own custom LinkedList class. Although it can mimic the CustomLinkedList
 *      class we used here, it must be entirely unique. Please also add at least two
 *      additional helper methods that you think could be useful. Refer to Java's built-in
 *      LinkedList class for inspiration. Your new LinkedList class should ONLY allow users
 *      to add and remove elements from the front of the list AND the end of the list.
 *      Also, instead of using the index in the get() and remove() methods, these methods should
 *      get() and remove() based by the Node's value, not it's index.
 */

public class NumberLinkedList<T> {

    // variable for head Node
    private Node head;

    public NumberLinkedList(T... data) {

        if (data.length < 1) {
            head = null;
        } else {
            for (int i = 0; i < data.length; i++) {
                add(data[i]);
            }
        }
    }

    public void add(T data) {
        insert(data, size());
    }

    public void insert(T data, int index) {
        // if "head" is null, create new root node
        if (head == null) {
            head = new Node(data);
        } else {

            // new reference to the head node
            Node iterator = head;

            // track the "previous" node in the list as we traverse
            Node previous = null;

            if (index == 0) {
                // insert a new node to the front of the list
                head = new Node(data, head);

            } else if (index < size()) {
                System.out.println("elements can only be inserted from the front or end, please try again");
                return;

            } else {
                // insert new node to the end of the list
                while (iterator.next != null) {
                    previous = iterator;
                    iterator = iterator.next;
                }

                iterator.next = new Node(data);
            }
        }
    }

    public void remove(T data) {
        if (data == null) {
            // delete the first node in the list set "head" to "head.next"
            head = head.next;
        }

        else if (data != null) {
                // delete the node at the end of the list

                Node iterator = head;

                // iterate to find last node
                while (iterator.next != null) {
                    iterator = iterator.next;
                }

                iterator.next = null;
            }
        }


    public T get(T data) {
        try {

            Node iterator = head;

            while (data != null) {
                iterator = iterator.next;
            }
            return (T) iterator.data;

        } catch (NullPointerException ex) {
            return null; // list is empty
        }
    }

    public int size() {
        int count = 0;
        Node iterator = head;

        // iterate through list
        while (iterator != null) {
            count++;
            iterator = iterator.next;
        }
        return count;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public Node getFirst() {
        final Node f = head;
        if (f == null)
            throw new NoSuchElementException();
        return f;
    }

    public Object peekFirst() {
        final Node f = head;
        return f.data;
    }
}