package labs_examples.lambdas.labs;

import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * Lambdas Exercise 1:
 * 1) Demonstrate creating a functional interface with an abstract method that takes no parameters and returns void
 * 2) Implement the previous functional interface with a lambda expression and use it. Also demonstrate creating
 * an anonymous inner class from this interface.
 * <p>
 * 3) Demonstrate creating a functional interface with an abstract method that takes 1 parameter and returns a
 * value of the same type as the parameter
 * 4) Implement the previous functional interface with a lambda expression and use it. Also demonstrate creating
 * an anonymous inner class from this interface.
 * <p>
 * 5) Demonstrate creating a functional interface with an abstract method that takes 2 parameters and returns a
 * value
 * 6) Implement the previous functional interface with a lambda expression and use it. Also demonstrate creating
 * an anonymous inner class from this interface.
 * <p>
 * 7) Demonstrate the use of at least two built-in functional interfaces from the java.util.function package.
 */

// Exercise 01 -2)
class Exercise01 {
    public static void main(String[] args) {
        Exercise_01_Interface print = () -> System.out.println("Printing to console from Lambda for exercise 01 -1");
        print.absFunction();


        // create anonymous inner class
        Exercise_01_Interface obj = new Exercise_01_Interface() {
            @Override
            public void absFunction() {
                System.out.println("Printing to console from Anonymous Inner Class for exercise 01 -1");
            }
        };
        obj.absFunction();

// Exercise 01 -4)
        Exercise_01_3_Interface func = (int a) -> a * 5;
        int x = func.returnInt(6);
        System.out.println("Printing from lambda, value returned: " + x);

        // create anonymous inner class
        Exercise_01_3_Interface obj2 = new Exercise_01_3_Interface() {
            @Override
            public int returnInt(int a) {
                int b = a * 5;
                System.out.println("Printing from inner class, value returned: " + b);
                return b;
            }
        };
        obj2.returnInt(6);

// Exercise 01 -6)
        ReturnTwoPara_Interface concat = (String one, String two) -> one + two;
        String returnString = concat.stringConcat("lambdas ", "are succinct");
        System.out.println(returnString);

        // create anonymous inner class
        ReturnTwoPara_Interface obj3 = new ReturnTwoPara_Interface() {
            @Override
            public String stringConcat(String s, String t) {
                return s + t;
            }
        };
        String innerClassString = obj3.stringConcat("Anonymous Inner classes ", "are verbose");
        System.out.println(innerClassString);

//7) Demonstrate the use of at least two built-in functional interfaces from the java.util.function package.

        Function<Integer, Integer> multiplyByFive = xy -> xy * 5;
        System.out.println(multiplyByFive.apply(4));

        String report = "Report xyz";
        Supplier<Integer> characterQty = () -> report.length();
        System.out.println("Number of characters in String " +report +" = " +characterQty.get());

    }
}