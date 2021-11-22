package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 1:
 *
 *      1) Demonstrate a try/catch.
 *
 */

class TryCatch {

    public static void main(String[] args) {
        int a = 0;
        int b = 2;

        try{
            int c = b/a;
        } catch (ArithmeticException one){
            System.out.print("Caught arithmetic exception");
        }
    }
}

