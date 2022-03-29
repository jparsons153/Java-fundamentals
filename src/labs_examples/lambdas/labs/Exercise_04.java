package labs_examples.lambdas.labs;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Lambdas Exercise 4:
 *
 *      Stream API Labs
 *
 *      1) Demonstrate the use of the range function to print out the numbers 1 through 15 (inclusive)
 *      2) Demonstrate the use of the sum function to determine the range of a set of numbers.
 *      3) Demonstrate the use of the map() function to alter each int in a List of Integers, then use the sum function
 *          to get the sum of the modified list
 *      4) Demontrate the filter function by filtering out all Integers that are less than 10 - then use the average
 *          function to average the remaining numbers, assign this result to an int variable.
 *      5) Demonstrate the reduce() function to determine the sum of a list of Integers
 *      6) Demontsrate how to Stream a text file and print out each line
 *      7) Demonstrate how to Stream the stream_text_lab.csv file in this package. Split the lines into String arrays,
 *          then print out the element at the 1 index for each array.
 *      8) Demonstrate how to Stream the stream_text_lab.csv file in this package. Split the lines into String arrays,
 *          the print out the sum of all elements at index 2.
 *      9) Demonstrate the anyMatch() function.
 *      10) Demonstrate the allMatch() function.
 *      11) Demonstrate the collect() terminal operation to store resulting values into a List
 *      
 */

class Example {

    public static void main(String[] args) {
        range();

        sum();

        int[] arra = {12, 7, 3, 67, 86};
        mapFunc(arra);

        int filterAvg = (int) filter(arra);

        Integer[] numbers = {23, 7, 62, 3, 11, 9};
        int sumReduce = reduceSum(numbers);

        String textFile = "C:\\Users\\User\\Documents\\labs\\online-java-fundamentals\\src\\labs_examples\\input_output\\files\\char_data.txt";
        streamTxt(textFile);

        splitString(textFile);

    }

    //#1 range function
    private static void range() {
        IntStream.rangeClosed(1, 15).forEach(System.out::print);
    }

    //#2 sum function
    private static void sum() {
        int rangeSum = IntStream.range(1, 10).sum();
        System.out.println(rangeSum);
    }

    //#3 map function
    private static void mapFunc(int[] array) {
        int calc = Arrays.stream(array).map(y -> y * 3 - 2).sum();
        System.out.println(calc);
    }

    //#4 Filter int<10
    private static double filter(int[] array) {
        return Arrays.stream(array).filter(y -> y > 10).average().orElse(Double.NaN);
        // reference baeldung.com/java-array-sum-average, accessed 04JAN22
    }

    //#5 reduce function to determine the sum of a list of Integers
    private static int reduceSum(Integer[] nums) {
        Stream<Integer> s = Arrays.stream(nums);
        return s.reduce(0, (Integer x, Integer y) -> x + y);
    }

    //#6 Stream a text file and print out each line
    private static void streamTxt(String filePath) {

        Stream<String> txtFile = null;
        try {
            txtFile = Files.lines(Paths.get(filePath));
        } catch (IOException e) {
            e.printStackTrace();
        }
        txtFile.forEach(System.out::println);
        txtFile.close();
    }

    //#7 Stream the stream_text_lab.csv file in this package. Split the lines into String arrays,
    //   then print out the element at the #1 index for each array.

    private static void splitString(String filePath) {

        try {
            Stream<String> splitString = Files.lines(Paths.get(filePath));

            splitString.map(x -> x.split(" "))
                    .filter(x -> x.length == 3)
                    .filter(x -> x.length == 3)
                    .filter(x -> Integer.parseInt(x[1]) > 15)
                    .forEach(x -> System.out.println(x[0] + "  " + x[1] + "  " + x[2]));
            splitString.close();


            // List<String[]> stringIndex = splitString.map(x -> x.split("\n"));

            // for each String array, print element [0]. Arrays contain all elements at [0], split by delimiter "space"
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}