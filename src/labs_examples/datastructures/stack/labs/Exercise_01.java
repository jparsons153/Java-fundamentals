package labs_examples.datastructures.stack.labs;

import java.util.Stack;

/**
 *      Demonstrate your mastery of Java's built-in Stack class by completing the following:
 *
 *      1) instantiate a new Stack
 *      2) demonstrate the use of EVERY method in the Stack class - there are 5
 */

class Exercise_01 {

    public static void main(String[] args) {
        Stack<String> partsForInspection = new Stack();
        if(partsForInspection.empty()){
            System.out.println("empty stack");
        }

        //#1 Push
        partsForInspection.push("widget #1");
        partsForInspection.push("widget #2");
        partsForInspection.push("widget #3");
        partsForInspection.push("spinning top #1");

        // #2 size
        System.out.println("Number of parts waiting for inspection " + partsForInspection.size());

        // #3 peek
        System.out.println("Peek at first few items " +partsForInspection.peek());

        // #4 search
        System.out.println("Does the list contain 'widget' " +partsForInspection.search("widget") + "\n");


        // #5 pop
        partsForInspection.pop();
        System.out.println("Inspection complete of first item");

        System.out.println("Number of parts waiting for inspection " + partsForInspection.size());

    }

}