package labs_examples.objects_classes_methods.labs.methods;
import java.util.Arrays;

public class HighAndLow_Array {
    public static void main(String[] args) {
        int[] array = {11, 2, 34, 14, 56, 99, 7, 88, 12, 10};

        System.out.println("Array before sort: ");
        for (int n : array) {
            System.out.print(n + " ");
        }

        ArraySort(array);

    } // main method

    public static void ArraySort(int[] array) {
        Arrays.sort(array);// sort array

        System.out.println("\n\n" + "Modified array[]: " + Arrays.toString(array));

        System.out.println("\n"+"3 max values of Array: ");
        for (int i = 9; i > 6; i--) {
            System.out.print(array[i] + " ");
        }

        System.out.println("\n\n" + "3 min values of Array: ");
        for (int i = 0; i < 3; i++) {
            System.out.print(array[i] + " ");
        }
    }
}