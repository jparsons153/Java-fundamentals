package labs_examples.conditions_loops.labs;

import java.util.Scanner;

import static java.lang.System.out;

/**
 * Conditions and Loops Exercise 7: First vowel
 *
 *      Take in a word from the user and using a "while" loop, find the first vowel in the word.
 *      Once you find the vowel, print out the word and the first vowel.
 *
 *      Hints:
 *          - there are a few helpful methods in the String class called length(), charAt() and indexOf()
 *          - you'll likely want to use a String that contains all the vowels:
 *              - ie: String vowels = "aeiou";
 */

public class Exercise_07 {
public static void main (String[] args) {
    // create scanner
    Scanner scanner = new Scanner(System.in);
    // prompt user
    out.println("Enter a word to return the first vowel in that word: ");
    // assign input to string
    String str = scanner.next();

    String vowels = "aeiou";

    for (int i = 0; i < str.length(); i++) {
        for (int j = 0; j < vowels.length(); j++) {
            if (str.charAt(i) != vowels.charAt(j))
                continue;
            System.out.println("word entered = " + str + ", first vowel found =  " + str.charAt(i));
                return;
        }
    }
    }
    }
