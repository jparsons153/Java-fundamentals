package labs_examples.datastructures.linkedlist.labs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

/**
 *      LinkedLists - Exercise_01
 *
 *      Demonstrate your mastery of Java's built-in LinkedList class by demonstrating the following:
 *
 *      1) create a LinkedList (from Java's libraries)
 *      2) add()
 *      3) addAll()
 *      4) addFirst()
 *      5) addLast()
 *      6) getFirst()
 *      7) getLast()
 *      8) get()
 *      9) set()
 *      10) push()
 *      11) pop()
 *      12) remove()
 *      13) contains()
 *      14) listIterator()
 *      15) clear()
 */

class LinkedlistExample {
    public static void main(String[] args) {
        // #1
        LinkedList<String> someRamblings = new LinkedList<>();

        // #2
        someRamblings.add("this");
        someRamblings.add("is");
        someRamblings.add("a");
        someRamblings.add("random");
        someRamblings.add("list");

        // #3
        ArrayList<String> moreWords = new ArrayList<String>();
        moreWords.add("of");
        moreWords.add("random");
        moreWords.add("words");

        someRamblings.addAll(moreWords);

        // #4
        someRamblings.addFirst("LinkedList");

        // #5
        someRamblings.addLast("!");

        //#6
        System.out.println("First element in LinkedList ;" + someRamblings.getFirst());

        // #7
        System.out.println("Last element in LinkedList ;" + someRamblings.getLast());

        // #8
        System.out.println("Element #3 in LinkedList ;" + someRamblings.get(3));

        // #9
        someRamblings.set(5,"generic list");

        // #10
        someRamblings.push("A");

        // #11
        someRamblings.pop();

        // #12
        someRamblings.remove();

        // #13
        System.out.println("Does this list contain 'Java' ;" + someRamblings.contains("Java"));

        // #14
        ListIterator<String> elementIterator = someRamblings.listIterator();

        while(elementIterator.hasNext()) {
            System.out.println(elementIterator.next());
        }

        // #15
        someRamblings.clear();

    }
}
