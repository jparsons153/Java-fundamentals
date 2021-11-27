package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 4:
 *
 *      Demonstrate a nested try/catch.
 *
 */

class NestedTry {

    public static void main(String[] args) {

        int array[] = {2, 5, 17, 8};

        try {
            try {
                System.out.println(array[10]);

            } catch (ArithmeticException exc) {
                System.out.println("Arithmetic Exception");
                System.out.println("Try block 2");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index out of bounds exception");
            System.out.println("Try block 1");
        }
    }
}
