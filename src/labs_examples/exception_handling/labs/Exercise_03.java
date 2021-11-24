package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 3:
 *
 *      Demonstrate a try/catch/finally block.
 *
 */
class Exercise03 {

    public static void main(String[] args) {

        int[] nums = {10, 2, 6, 32};

        try {
            int c = nums[0] / nums[5];
        } catch (ArrayIndexOutOfBoundsException error) {
            System.out.println("ArrayIndex Out of Bounds Exception error");
        } catch (ArithmeticException error2) {
            System.out.println("Arithmetic Exception error");
        } catch (Exception exc) {
            System.out.println("Exception error");

        } finally {
            System.out.println("Reached end of code block");
        }
    }
}