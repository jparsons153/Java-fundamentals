package labs_examples.objects_classes_methods.labs.methods;

import java.util.Scanner;

import static java.lang.System.out;

// Methods Exercise 02 05) check if a number is prime

public class checkPrime {

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
