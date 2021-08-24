package labs_examples.arrays.labs;

import java.util.Scanner;

/**
 * Arrays calculator
 *
 *      Take in 10 numbers from the user. Place the numbers in an array. Using the loop of your choice,
 *      calculate the sum of all of the numbers in the array as well as the average.
 *
 *      Print the results to the console.
 *
 */

public class Exercise_01 {
    public static void main(String[] args) {

        // create scanner
        Scanner scanner = new Scanner(System.in);
        // create array
        int[] numbers = new int[10];

        for (int i = 0; i < 10; i++) {
            // prompt user
            System.out.print("Enter a number:  ");
            // assign input to array
            numbers[i] = scanner.nextInt();
        }
        int total =0;
        for (int numb : numbers) {
            System.out.print(numbers[numb]);
            total = numb + total;
        }
        System.out.println("\n");
        System.out.println("Sum of all numbers entered is " + total);
        System.out.println("Average of all numbers entered is " + total/10);
    }
}