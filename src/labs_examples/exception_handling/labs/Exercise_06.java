package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 6:
 *
 *      Demonstrate throwing an exception in one method and catching it in another method.
 *
 */

class Excerise_06 {
    public static void main(String[] args) {
        try{
            methodOne();
        } catch (ArrayIndexOutOfBoundsException exc){
            System.out.println("Exception from methodOne caught");
        }
    }

    public static void methodOne() throws ArrayIndexOutOfBoundsException {
        int arr[] = {12, 6, 45};
        try{
            int c = arr[3];
        } catch (ArrayIndexOutOfBoundsException exc){
            System.out.println("Throwing exception back to main method");
            throw exc;
        }
    }
}

