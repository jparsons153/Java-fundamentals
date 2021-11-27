package labs_examples.exception_handling.labs;


import java.util.Scanner;

/**
 * Exception Handling Exercise 7:
 *
 *      1) Create a custom exception.
 *      2) Demonstrate a method throwing your custom exception.
 */

class OutofGasException extends Exception {
    @Override
    public String toString(){
        return "Out of Gas Exception";
    }
}

class Exercise_07 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter trip distance (miles)");
        int miles = scanner.nextInt();

        Scanner fuel = new Scanner(System.in);
        System.out.println("Enter remaining fuel (litres) ");
        int litres = scanner.nextInt();

        int MPG = 38;

        try {
            // double gallons = litres / 0.22;
            if (miles / MPG > (litres / 0.22)) {
                System.out.println("Trip is within range");
            }
            else {
                throw new OutofGasException();
            }
        }catch(OutofGasException exc){
                System.out.println("Not enough gas");

        }catch(ArithmeticException ex){
            System.out.println("Litres is zero");
        }
    }
}