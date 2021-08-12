package labs_examples.conditions_loops.labs;

/**
 * Conditions and Loops Exercise 10: continue
 *
 *      Demonstrate the use of the "continue" statement to skip to the next iteration of a loop.
 *
 */

public class Exercise_10 {
    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {
            if ((i % 2) != 0) {
                continue; // iterate
            }
            System.out.println(i);
        }
    }
}
