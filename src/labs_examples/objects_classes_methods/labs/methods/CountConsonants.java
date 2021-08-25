package labs_examples.objects_classes_methods.labs.methods;

import java.util.Scanner;

import static java.lang.System.out;

// Methods Exercise 2 4) Count Consonants

public class CountConsonants {
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
