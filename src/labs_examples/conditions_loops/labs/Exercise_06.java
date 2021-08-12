package labs_examples.conditions_loops.labs;

/**
 * Conditions and Loops Exercise 6: Basic while loop
 *
 *      Use a "while" loop find the sum of numbers to from 1-100. Print the sum to the console
 *
 */

public class Exercise_06 {

    public static void main(String[] args) {
        int count = 0;
        int val = 0;
        while (count < 100) {
            count++;
            val = count + val;
        }
        System.out.println(val);
    }
}