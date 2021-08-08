package labs_examples.conditions_loops.labs;

/**
 * Conditions and Loops Exercise 4: Even numbers
 *
 *      Using a "for-loop", print out all even numbers from 1-100.
 *
 */

public class Exercise_04 {
    public static void main(String[] args) {

        for (int count = 0; count < 100; count++) {
            if (count % 2 == 0) {
                System.out.println("This is even count: " + count);
            }
        }
    }
}