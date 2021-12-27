package labs_examples.generics.labs;

/**
 * Generics Exercise 2:
 * Create a class with a generic method that takes in an ArrayList of any Numeric type and returns the sum of all
 * Numbers in the ArrayList. Demonstrate how to call this method from the main() method.
 */

import java.util.ArrayList;

class Demo {

    public static void main(String[] args) {

        ArrayList<Integer> array = new ArrayList<Integer>();
        array.add(5);
        array.add(10);
        array.add(20);

        int result = (int) sumArray(array);
        System.out.println(result);
    }

    public static <T extends Number> int sumArray(ArrayList<T> arra) {
        int total = 0;

        for (T ele : arra) {
            total = ele.intValue() + total;
        }
        return total;
    }
}