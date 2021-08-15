package labs_examples.arrays.labs;

/**
 *  Traversing Arrays Backwards
 *      Please create and populate an array of your choosing. Then, please demonstrate how to print out every other
 *      element in the array in reverse order.
 */

public class Exercise_05 {
    public static void main(String[] args) {

        int t, i;
        int table[][] = new int[5][5];

        for (t = 0; t < 5; t++) {

            for (i = 0; i < 5; i++) {
                table[t][i] = ((t * 5) + i + 1) * 3;
            }
        }
        for (t = 0; t < 5; t++) {
            for (i = 0; i < 5; i++) {
                System.out.print(table[t][i] + " ");
            }
            System.out.println();
        }

            for (t = 4; t >= 0; t--) {
                for (i = 4; i >= 0; i--) {
                    if (i%2!=0)
                        continue;
                    System.out.print(table[t][i] + " ");
                }
                System.out.println();

            }
    }
}
