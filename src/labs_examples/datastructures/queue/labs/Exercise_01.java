package labs_examples.datastructures.queue.labs;

import java.util.PriorityQueue;

/**
 *      Demonstrate your mastery of Java's (sun's) built-in Queue class (as seen in the import statement
 *      above) by completing the following:
 *
 *      1) instantiate a new Queue
 *      2) demonstrate the use of EVERY method in the Queue class - there are 7
 */

class Exercise_01 {

    public static void main(String[] args) {

        PriorityQueue<String> coffeeQueue = new PriorityQueue<>();

        // #1 add
        coffeeQueue.add("flat white");
        coffeeQueue.add("Oat Mocha");
        coffeeQueue.add("Oat");
        coffeeQueue.add("Cappuccino extra hot");
        coffeeQueue.add("Americano signature roast");

        // #2 peek
        System.out.println(coffeeQueue.peek());

        // #3 contains
        boolean hasOat = coffeeQueue.contains("Oat");
        System.out.println("Do I need Oat milk for the current Queue ?" +hasOat);

        // #4 remove
        String drinkOne = coffeeQueue.remove();
        System.out.println(drinkOne);

        // #5 element
        String nextDrink = coffeeQueue.element();
        System.out.println("Next drink in the queue is " +nextDrink);

        // #6 offer
        coffeeQueue.offer("Latte");

        // #7 clear
        coffeeQueue.clear();
    }
}