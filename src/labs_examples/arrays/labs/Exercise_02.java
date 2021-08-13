package labs_examples.arrays.labs;

import java.util.Scanner;

import static java.lang.System.out;

/**
 *  More labs_examples.arrays
 *
 *      Using the array below, take in a number from 1-10 from the user and print out the index of that
 *      element.
 *
 */

public class Exercise_02 {

    public static void main(String[] args) {

        int[] array = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        // write code here

        // create scanner
        Scanner scanner = new Scanner(System.in);
        // prompt user
        out.println("Enter a number 1-10 to determine index of that element: ");
        // assign input to string
        int number = scanner.nextInt();

        for (int i =0; i< array.length; i++){
            if(number != array[i])
                continue;
                System.out.print(i);
        }
    }
}