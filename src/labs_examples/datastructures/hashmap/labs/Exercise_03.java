package labs_examples.datastructures.hashmap.labs;

import java.util.Iterator;
import java.util.LinkedList;

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
    }

    // linkedlist
    public static LinkedList<Integer> linkedList(){

        // create a LinkedList of type String
        LinkedList<Integer> linkedList = new LinkedList<Integer>();

        // add 100 elements to the LinkedList
        for (int i=0; i<101; i++) {
            linkedList.add(i);
        }

        // update each element
        for (int i=0; i<101; i++) {
            linkedList.set(i,i+10);
        }

        // search for each element
        for(int j=100; j>0; j--){
            boolean searchList = linkedList.contains(j+10);
            System.out.println("\n\nList contains \"LinkedList\": " + searchList);
        }

        // delete each element
        // TO DO fix index out of bounds
        for (int k=0; k<101; k++) {
            linkedList.remove(k);
        }

        // return LinkedList
/*
        Iterator i = linkedList.iterator();
        while(i.hasNext()){
            System.out.print(i.next()+ " ");
        }
*/        return linkedList;
    }
}