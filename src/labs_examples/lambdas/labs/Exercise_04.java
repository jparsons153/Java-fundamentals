package labs_examples.lambdas.labs;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
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
 *      1) Demonstrate the use of the range function to print out the numbers 1 through 15 (inclusive) - done
 *      2) Demonstrate the use of the sum function to determine the range of a set of numbers. - done
 *      3) Demonstrate the use of the map() function to alter each int in a List of Integers, then use the sum function
 *          to get the sum of the modified list - done
 *      4) Demontrate the filter function by filtering out all Integers that are less than 10 - then use the average
 *          function to average the remaining numbers, assign this result to an int variable. - done
 *      5) Demonstrate the reduce() function to determine the sum of a list of Integers - done
 *      6) Demontsrate how to Stream a text file and print out each line - done
 *      7) Demonstrate how to Stream the stream_text_lab.csv file in this package. Split the lines into String arrays,
 *          then print out the element at the 1 index for each array. - done
 *      8) Demonstrate how to Stream the stream_text_lab.csv file in this package. Split the lines into String arrays,
 *          the print out the sum of all elements at index 2. - map to int??
 *      9) Demonstrate the anyMatch() function. - done
 *      10) Demonstrate the allMatch() function. - done
 *      11) Demonstrate the collect() terminal operation to store resulting values into a List - done
 *      
 */

class Example {

    public static void main(String[] args) {
        range();

        sum();

        int[] arra = {12, 7, 3, 67, 86};
        mapfunc(arra);

        int filterAvg = (int) filter(arra);

        Integer[] numbers = {23, 7, 62, 3, 11, 9};
        int sumReduce = reducesum(numbers);

        String textFile = "C:\\Users\\User\\Documents\\labs\\online-java-fundamentals\\src\\labs_examples\\input_output\\files\\char_data.txt";
        String textLabfile = "C:\\Users\\User\\Documents\\labs\\online-java-fundamentals\\src\\labs_examples\\lambdas\\labs\\stream_text_lab.csv";

        //streamTxt(textFile);

        printindexone(textLabfile);

        // sumIndexTwo(textLabfile);

        anymatch(textLabfile);

        allmatch(textLabfile);

        collectmethod(textLabfile);

        sumIndexTwo(textLabfile);

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
    private static void mapfunc(int[] array) {
        int calc = Arrays.stream(array).map(y -> y * 3 - 2).sum();
        System.out.println(calc);
    }

    //#4 Filter int<10
    private static double filter(int[] array) {
        return Arrays.stream(array).filter(y -> y > 10).average().orElse(Double.NaN);
        // reference baeldung.com/java-array-sum-average, accessed 04JAN22
    }

    //#5 reduce function to determine the sum of a list of Integers
    private static int reducesum(Integer[] nums) {
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

    private static void printindexone(String textLabfile) {

        try {
            Stream<String> splitString = Files.lines(Paths.get(textLabfile));

            splitString.map(x -> x.split(","))
                    .forEach(x -> System.out.println(x[1]));
            splitString.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // #8 Demonstrate how to Stream the stream_text_lab.csv file in this package. Split the lines into String arrays,
    //    then print out the sum of all elements at index 2.

    private static void sumIndexTwo(String textLabfile) {

        try {
           Stream<String> splitString = Files.lines(Paths.get(textLabfile));

            Double sum = splitString.map(x -> x.split(","))
                    .mapToDouble(b -> Double.parseDouble(b[2])).sum();

            System.out.println("Numbers in textlabFile :" + sum);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // #9 Demonstrate the anyMatch() function

    private static void anymatch(String textLabfile) {

        try {
            Stream<String> splitString = Files.lines(Paths.get(textLabfile));

            boolean containsWorld = splitString.anyMatch(s -> s.contains("World"));

            System.out.println("Does the text file contain the word 'World' " + containsWorld);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // #10 Demonstrate the allMatch() function

    private static void allmatch(String textLabfile) {

        try {
            Stream<String> splitString = Files.lines(Paths.get(textLabfile));

            boolean allContainsWorld = splitString.allMatch(s -> s.contains("World"));

            System.out.println("Does each element in the text file contain the word 'World' " + allContainsWorld);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // #11 Demonstrate the collect() terminal operation to store resulting values into a List
    private static void collectmethod(String textLabfile) {
        try {
            Stream<String> splitString = Files.lines(Paths.get(textLabfile));

            List<String> containsWorld = splitString.filter(s -> s.contains("World"))
                    .collect(Collectors.toList());

            System.out.println(containsWorld);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}