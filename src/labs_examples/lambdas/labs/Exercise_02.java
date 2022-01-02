package labs_examples.lambdas.labs;

import java.util.Arrays;
import java.util.List;
import java.util.function.*;
import java.util.stream.IntStream;

/**
 * Lambdas Exercise 2:
 *
 *      1) Demonstrate the use of 10 pre-built Functional Interfaces from the java.util.functions package. That's right,
 *      10 of them! You can do it! You'll know so much about them when you're done!
 */

class Photo {

    public static void main(String[] args) {

        int width = 4700;
        int height = 3133;

        //#1
        BiFunction<Integer, Integer, Integer> pixelCalculate = ((w, h) -> w.intValue() * h.intValue());
        int totalPixel = pixelCalculate.apply(width, height);
        System.out.println(totalPixel + " pixels");

        //#2
        IntToDoubleFunction pixelToMB = (p) -> (p*3)/(1024*1024);
        System.out.println(pixelToMB.applyAsDouble(totalPixel) + " MB");

        //#3
        BiPredicate<Integer, Integer> lessThanMaxInstaSize = (w, h) -> (w.intValue() | h.intValue()) <= 1080;
        System.out.println("Is image less than max 1080 pixels in length or width: " +lessThanMaxInstaSize.test(width, height));

        //#4
        // Consumer functional interface
        List<String> aspectRatios = Arrays.asList("16:9 Landscape", "1:1 Square", "4:5 Vertical", "2:3 Vertical", "9:16 Full Portrait");
        aspectRatios.forEach(ratio -> System.out.println(ratio));

        // print colours of each pixel by RGB (BIConsumer)
        // RGB to BinaryString (Supplier)

        //#5
        // change RGB to greyScale (Grayscale = 0.299R + 0.587G + 0.114B)
        int[] teal = {0,128,128};
        int[] mango = {255, 205, 72};
        int[] lavender = {181, 126, 220};

        //Function<Integer[],Integer> toGreyScale = (r,g,b) -> (r.)




    }
}