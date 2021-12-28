package labs_examples.lambdas.labs;

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
    }
// Exercise 01 -3) 



}