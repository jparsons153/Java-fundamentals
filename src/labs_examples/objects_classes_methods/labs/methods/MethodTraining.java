package labs_examples.objects_classes_methods.labs.methods;

import labs_examples.objects_classes_methods.labs.objects.Person;

import java.util.Scanner;

import static java.lang.System.out;

public class MethodTraining {
// 1) method overloading

    public static int addition(int a, int b) {
        return a + b;
    }

    public static int addition(int a, int b, int c) {
        return a + b + c;
    }

    public static int addition(double a, double b, double c) {
        return ((int) (a + b + c));
    }
}

// 2) pass by value vs pass by reference
// pass by value
class PassingValues {
    public static void main(String[] args) {
        double a = 12;
        double b = 14;

        System.out.println("before a:" + a);
        System.out.println("before b:" + b);

        someOtherMethod(a, b);

        System.out.println("before a:" + a);
        System.out.println("before b:" + b);
    }

    public static void someOtherMethod(double a, double b) {
        a = a * 10;
        System.out.println(a);
        b = b * 20;
        System.out.println(b);
    }
}

// Exercise 02 2) pass by reference - see separate file (public class)

// Exercise 03 Return largest number
class ReturnLargestNumber {
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

// Exercise 04 count consonants

class CountConsonants {
    public static void main(String[] args) {
// create scanner
        Scanner scanner = new Scanner(System.in);
        // prompt user
        out.println("Enter a word to return the number of consonants in that word: ");
        // assign input to string
        String str = scanner.next();

        String conson = "bcdfghjklmnpqrstvwxyz";

        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < conson.length(); j++) {
                if (str.charAt(i) != conson.charAt(j))
                    continue;
                count++;
            }
        }
        System.out.println("Number of consonants in word entered = " + count);
    }
}

// Exercise 05 Determine if Prime number
class checkPrime {

    static boolean isPrime(int n){
        if (n <= 1)
            return false;
        if (n<= 3)
            return true;

        // Check if can skip middle five numbers
        if (n%2 == 0 || n%3 == 0)
            return false;

        for (int i = 5; i * i <= n; i = i +6)
            if (n % i == 0 || n % (i+2) == 0)
                return false;
        return true;
    }

    public static void main(String[] args) {
        // create scanner
        Scanner scanner = new Scanner(System.in);
        // prompt user
        out.println("Enter a number to check if Prime: ");
        // assign input to int n
        int n = scanner.nextInt();

        boolean bool = isPrime(n);

        System.out.println(bool);
    }
}

// Exercise 06 return largest & smallest numbers in an array



// Exercise 07 method that takes 3 arguments (int maxNum, int divisor1, int divisor2) and returns an Integer Arraylist.
//        In this method create an Integer ArrayList and populate it with each number between zero and maxNum that is
//        divisible by both divisor1 and divisor2. Then return this ArrayList. After calling this method, print out the
//        length of the returned list


// Exercise 08 method that will reverse an array in place use only one extra temp variable
class Reverse_Array {
    public static void main(String[] args) {
        int[] nums = {45, 87, 62, 99, 1, 42, 12};

        int temp; // temporary variable for storing number

        // nums.length/2 as each number is swapped with one other
        for (int i = 0; i < nums.length / 2; i++) {
            temp = nums[nums.length - 1 - i];
            nums[nums.length - 1 - i] = nums[i];
            nums[i] = temp;
        }
        System.out.print("Contents of array after for loop - ");
        // print each element of the array to verify reverse order
        for (int i : nums) {
            System.out.print(i + " ");
        }
    }
}



