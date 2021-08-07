package labs_examples.conditions_loops.labs;

public class For_loop_test {

    public static void main(String[] args) {
        // for loop below to print out every number between 0 & 100

        for (int count = 0; count < 100; count++) {
            System.out.println("This is count: " + count);
        }

        for (int count = 100; count > 0; count -= 1) {
            if (count % 2 != 0) {
                System.out.println("This is odd count: " + count);
            }
        }
        // nesting two for loops
        for (int outerCount = 0; outerCount < 10; outerCount++) {
            for (int innerCount = 0; innerCount < 10; innerCount++) {
                System.out.println("inner count = " + innerCount);
            }
            System.out.println("Outer count = " + outerCount);
        }
    }
}
