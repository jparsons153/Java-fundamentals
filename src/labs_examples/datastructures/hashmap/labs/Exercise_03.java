package labs_examples.datastructures.hashmap.labs;

import java.util.*;

/**
 *      HashMaps Exercise_02
 *
 *      Create a new class that does the following:
 *
 *      1) create a LinkedList
 *      2) create a Stack
 *      3) create a Queue
 *      4) create a HashMap
 *
 *      Then, add millisecond timers before and after each data structure above and print out
 *      how long it takes for each to complete EACH the following tasks, and the total time for
 *      each data structure:
 *
 *      1) add 100 elements
 *      2) update 100 elements
 *      3) search for 100 elements
 *      4) delete 100 elements
 */

class HashmapsExercise02 {

    public static void main(String[] args) {

        linkedList();

        intStack();

        intQueue();

        intHashmap();
    }

    // linkedlist
    public static LinkedList<Integer> linkedList() {

        LinkedList<Integer> linkedList = new LinkedList<Integer>();

        // add 100 elements to the LinkedList
        for (int i = 0; i < 101; i++) {
            linkedList.add(i);
        }

        // update each element
        for (int i = 0; i < 101; i++) {
            linkedList.set(i, i + 10);
        }

        // search for each element
        for (int j = 100; j > 0; j--) {
            boolean searchList = linkedList.contains(j + 10);
            System.out.println("List contains " + j + " " + searchList);
        }

        // delete each element
        linkedList.clear();

        return linkedList;
    }

    // stack
    public static Stack<Integer> intStack() {
        Stack<Integer> intStack = new Stack();

        // add 100 elements
        for (int i = 0; i < 101; i++) {
            intStack.push(i);
        }

        // update each element
        for (int i = 0; i < 101; i++) {
            intStack.set(i, i + 20);
        }

        // search for each element
        for (int j = 100; j > 0; j--) {
            int searchStack = intStack.search(j + 20);
            System.out.println("Stack contains " + j + " " + searchStack);
        }

        // delete each element
        for (int k = 100; k > 0; k--) {
            intStack.pop();
        }

        return intStack;
    }

    // Queue
    public static Queue<Integer> intQueue() {
        PriorityQueue<Integer> intQueue = new PriorityQueue<>();

        // add 100 elements
        for (int i = 0; i < 101; i++) {
            intQueue.add(i);
        }

        // update each element
        // dequeue and enqueue with updated elements


        // search each element
        for (int j = 100; j > 0; j--) {
            boolean searchQueue = intQueue.contains(j);
            System.out.println("Queue contains " + j + " " + searchQueue);
        }

        // delete each element
        for (int k = 100; k > 0; k--) {
            intQueue.remove(k);
        }

        return intQueue;
    }

    // Hashmap
    public static HashMap<Integer, Integer> intHashmap() {

        HashMap<Integer, Integer> intHashmap = new HashMap<>();

        // add 100 elements
        for (int i = 0; i < 101; i++) {
            intHashmap.put(i, i + 10);
        }

        // update each element
        for (int j = 0; j < 101; j++) {
            intHashmap.replace(j, j + 20);
        }

        // search each element
        for (int k = 0; k < 101; k++) {
            int searchMap = intHashmap.get(k);
            System.out.println("Hashmap contains " + k + " " + searchMap);
        }

        // delete each element
        for (int l = 0; l < 101; l++) {
            intHashmap.remove(l);
        }

        return intHashmap;
    }
}