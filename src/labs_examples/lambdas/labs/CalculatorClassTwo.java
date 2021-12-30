package labs_examples.lambdas.labs;

/**
 * Tasks:
 *
 * Complete the other 3 operations (subtract, multiply & divide)
 * Implement a second functional interface for single operands
 * Implement a lambda expression for the square root operation
 * Hint: Square Root is calculated with the method Math.sqrt(value)
 *
 */
@FunctionalInterface
interface TwoOperandCalculation{
    double calculate(double x, double y);
}

//Create a second @FunctionalInterface for single operands calculations

@FunctionalInterface
interface SingleOperandCalculation{
    double calculate(double x);
}

public class CalculatorClassTwo {

    TwoOperandCalculation sum = (x , y) -> x+y; // Returns the sum of x and y

    //subtract
    TwoOperandCalculation subtract = (x, y) -> x-y;

    //multiply
    TwoOperandCalculation multiply = ((x, y) -> x*y);

    //divide
    TwoOperandCalculation divide = ((x, y) -> x/y);

    //sqrRoot
    SingleOperandCalculation sqrRoot = (x) -> Math.sqrt(x);

}
