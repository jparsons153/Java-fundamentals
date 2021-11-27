package labs_examples.exception_handling.labs;

import java.util.Arrays;

/**
 * Exception Handling Exercise 5:
 *
 *      Demonstrate how to throw an exception.
 *
 */

class Example {

    public static void main(String[] args) {

        int array[] = {2, 0};

        try {
            int c = divide(array[0], array[1]);
        } catch (ArithmeticException exc) {
            System.out.println("Arithmetic exception from divide method");
        }
    }

public static int divide(int a, int b) throws ArithmeticException {
    return a/b;
    }
}