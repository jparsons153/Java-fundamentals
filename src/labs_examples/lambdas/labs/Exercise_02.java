package labs_examples.lambdas.labs;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.DoubleToIntFunction;
import java.util.function.IntToDoubleFunction;

/**
 * Lambdas Exercise 2:
 *
 *      1) Demonstrate the use of 10 pre-built Functional Interfaces from the java.util.functions package. That's right,
 *      10 of them! You can do it! You'll know so much about them when you're done!
 */

public class Exercise_02 {

    public static void main(String[] args) {

        int width = 4700;
        int height = 3133;

        BiFunction<Integer, Integer, Integer> pixelCalculate = ((w, h) -> w.intValue() * h.intValue());
        int totalPixel = pixelCalculate.apply(width, height);
        System.out.println(totalPixel + " pixels");

        IntToDoubleFunction pixelToMB = (p) -> (p*3)/(1024*1024);
        System.out.println(pixelToMB.applyAsDouble(totalPixel) + " MB");

        BiPredicate<Integer, Integer> lessThanMaxInstaSize = (w, h) -> (w.intValue() | h.intValue()) <= 1080;
        System.out.println("Is image less than max 1080 pixels in length or width: " +lessThanMaxInstaSize.test(width, height));

        // Consumer functional interface
        List<String> aspectRatios = Arrays.asList("16:9 Landscape", "1:1 Square", "4:5 Vertical", "2:3 Vertical", "9:16 Full Portrait");
        aspectRatios.forEach(ratio -> System.out.println(ratio));

        // demonstrate use of Supplier functional interface 

    }

}