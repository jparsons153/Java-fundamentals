package labs_examples.enumerations.labs;

import java.util.Scanner;

/**
 * Enumerations Exercise 1:
 *
 *      1) Create an enumeration. Use a controller class to demonstrate the use of the enum from a seperate class.
 *      2) Create a parameterized enumeration that passes one or more values to it's constructor. Demonstrate the use
 *      of this enum from a seperate class.
 */

enum Month{
    January (1, 31),
    February (2, 28),
    March (3, 31),
    April (4, 30),
    May (5, 31),
    June (6, 30),
    July (7, 31),
    August (8, 31),
    September (9, 30),
    October(10, 31),
    November (11, 30),
    December (12, 31);

    private final int monthNumber;
    private final int calendarDays;

    Month(int monthNumber, int calendarDays) {
        this.monthNumber = monthNumber;
        this.calendarDays = calendarDays;
    }

    public int getMonthNumber() {
        return monthNumber;
    }

    public int getCalendarDays() {
        return calendarDays;
    }
}

class MonthController {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter month to return number of calendar days: ");
        String s = scanner.next();

        for(Month m: Month.values()){
            if(m.equals(s)) {
                System.out.println(m.getCalendarDays());
            }
        }
    }
}