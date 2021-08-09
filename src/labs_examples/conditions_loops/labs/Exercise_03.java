package labs_examples.conditions_loops.labs;

import java.util.Scanner;

//
// Conditions and Loops Exercise 3: Months of the year
//
//      Take in a number from the user and print "January", "February", ... "December", or "Other"
//     if the number from the user is 1, 2,... 12, or other respectively. Use a "switch" statement
//

public class Exercise_03 {

    public static void main (String[] args) {

        // create scanner
        Scanner scanner = new Scanner(System.in);
        // prompt user
        System.out.print("Enter a number to determine month of the year: ");
        // assign input to variable as int
        int number = scanner.nextInt();

        switch (number) {
            case 1:
                System.out.println("1st month of the year is January");
                break;
            case 2:
                System.out.println("2nd month of the year is February");
                break;

            case 3:
                System.out.println("3rd month of the year is March");
                break;
            case 4:
                System.out.println("4th month of the year is April");
                break;

            case 5:
                System.out.println("5th month of the year is May");
                break;
            case 6:
                System.out.println("6th month of the year is June");
                break;
            case 7:
                System.out.println("7th month of the year is July");
                break;
            case 8:
                System.out.println("8th month of the year is August");
                break;

            case 9:
                System.out.println("9th month of the year is September");
                break;
            case 10:
                System.out.println("10th month of the year is October");
                break;

            case 11:
                System.out.println("11th month of the year is November");
                break;

            case 12:
                System.out.println("12th month of the year is December");
                break;

            default :
                System.out.println("Number entered is not a month of the year");
        }
    }
}