package labs_examples.arrays.labs;

/**
 *  2D Array
 *
 *      Create and populate a 5x5 2D array with multiples of 3, starting with 3. Once populated, print out the results.
 *
 *      The output should look something like this:
 *
 *      3 6 9 12 15
 *      18 21 24 27 30
 *      ...
 *      ...
 *      ...
 *
 */

public class Exercise_03 {

    public static void main(String[] args) {
        int t, i;
        int table[][] = new int[5][5];

        for (t = 0; t < 5; t++) {

            for (i = 0; i < 5; i++) {
                table[t][i] = ((t * 5) + i + 1)*3;
            }
        }

        for (t = 0; t < 5; t++) {
            for (i = 0; i < 5; i++) {
                System.out.print(table[t][i] + " ");
            }
            System.out.println();
        }
    }
}
