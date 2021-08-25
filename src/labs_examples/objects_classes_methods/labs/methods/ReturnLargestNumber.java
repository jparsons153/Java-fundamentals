package labs_examples.objects_classes_methods.labs.methods;

import java.util.Scanner;

// Exercise 02 3) method that will return the largest of 4 numbers (all of which are passed in as arguments)
public class ReturnLargestNumber {
    public static void main(String[] args) {

        // create scanner
        Scanner scanner = new Scanner(System.in);
        // create array
        int[] numbers = new int[4];

        for (int i = 0; i < 4; i++){
            // prompt user
            System.out.print("Enter a number:  ");
            // assign input to array
            numbers[i] = scanner.nextInt();
        }
        int max = numbers[0];
        for (int i =0; i < 4; i++){
            if (numbers[i] < max)
            continue;
            max = numbers[i];
        }
        System.out.println("Max value = " + max);

        for (int n : numbers) {
            System.out.print(n);
        }
    }
}