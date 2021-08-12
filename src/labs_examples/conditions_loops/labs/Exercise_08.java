package labs_examples.conditions_loops.labs;

/**
 * Conditions and Loops Exercise 8: do-while loop
 *
 *      Use a "do-while" loop print out every third number counting backwards from 1000 to 1.
 */

public class Exercise_08 {
public static void main (String[] args) {

    int upper = 1000;
    int lower = 1;

    // deduct 3 from upper value until reaches lower value, print out result
    int val = upper;
    do {
        System.out.println(val);
        val = val-3;
    }
    while (val > lower);
}

}
