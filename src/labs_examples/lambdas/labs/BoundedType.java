package labs_examples.lambdas.labs;

public class BoundedType {

    /**
     * 1. Make the method generic and bound it to "extends Comparable<T>"
     * 2. Replace the int types for the generic T
     * 3. Change the comparisons ">" for "value1.compareTo(value2)""
     */

    public static void main(String[] args) {

        getMax(10, 12, 9);
    }

        public static <T extends Comparable> T getMax(T value1, T value2, T value3) {
            T max = value1;   // assume x is initially the largest

            if(value2.compareTo(max)>0) {
                max = value2;   // y is the largest so far
            }

            if(value3.compareTo(value2)>0) {
                max = value3;   // z is the largest now
            }
            return max;   // returns the largest object
        }
    }
