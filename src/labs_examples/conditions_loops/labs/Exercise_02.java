package labs_examples.conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 2: Days of the week
 *
 *      Take in a number from the user and print "Monday", "Tuesday", ... "Sunday", or "Other"
 *      if the number from the user is 1, 2,... 7, or other respectively. Use an if-else statement
 *      to accomplish this task.
 * 
 *      Bonus Tricky Challenge: Use a "nested-if" statement.
 *
 */

public class Exercise_02 {

    public static void main(String[] args) {

        // 1) create scanner (don't forget to import Scanner!)
        // 2) prompt user
        // 3) assign input to variable as int
        // 4) write completed code here

        // create scanner
        Scanner scanner = new Scanner(System.in);
        // prompt user
        System.out.print("Enter a number to determine day of the week: ");
        // assign input to variable as int
        int number = scanner.nextInt();

        if (number <= 7) {

            if (number == 1) {
                System.out.println("Day #1 of the week is a Monday");
            } else if (number == 2) {
                System.out.println("Day #2 of the the week is Tuesday");
            } else if (number == 3) {
                System.out.println("Day #3 of the the week is Wednesday");
            } else if (number == 4) {
                System.out.println("Day #4 of the the week is Thursday");
            } else if (number == 5) {
                System.out.println("Day #5 of the the week is Friday");
            } else if (number == 6) {
                System.out.println("Day #6 of the the week is Saturday");
            } else if (number == 7) {
                System.out.println("Day #7 of the the week is Sunday");
            }
        } else {
            System.out.println("number entered is not a day of the week");
        }
    }
}