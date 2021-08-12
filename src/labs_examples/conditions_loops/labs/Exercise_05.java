package labs_examples.conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 5: Calculator
 *
 *      Take two numbers from the user, an upper and lower bound. Using a "for-loop", calculate the sum
 *      of numbers from the lower bound to the upper bound. Also, calculate the average of numbers.
 *      Print the results to the console.
 *
 *      For example, if a user enters 1 and 100, the output should be:
 *
 *      The sum is: 5050
 *      The average is: 50.5
 */

public class Exercise_05 {
public static void main (String[] args){

    // create scanner
    Scanner lower = new Scanner(System.in);
    // prompt user
        System.out.print("Enter lower bound number: ");
    // assign lower to variable as int
    int intLower = lower.nextInt();

    Scanner upper = new Scanner(System.in);
    // prompt user
        System.out.print("Enter upper bound number: ");
    // assign upper to variable as int
    int intUpper = upper.nextInt();

    int val = (intLower-1);
        for (int i = intLower; i < (intUpper+1); i++) {
        val = i + val;
    }
        double sum = val;
        double average = sum / (intUpper-intLower +1) ;
        System.out.println("Sum of all numbers between lower and upper bound = " + sum);
        System.out.println("Average of all numbers entered between lower and upper bound = " + average);
}

}
