package labs_examples.lambdas.labs;

import java.util.Arrays;
import java.util.List;
import java.util.function.*;

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

        //#1 BiFunction
        BiFunction<Integer, Integer, Integer> pixelCalculate = ((w, h) -> w.intValue() * h.intValue());
        int totalPixel = pixelCalculate.apply(width, height);
        System.out.println(totalPixel + " pixels");

        //#2 IntToDouble Function
        IntToDoubleFunction pixelToMB = (p) -> (p*3)/(1024*1024);
        System.out.println(pixelToMB.applyAsDouble(totalPixel) + " MB");

        //#3 BiPredicate
        BiPredicate<Integer, Integer> lessThanMaxInstaSize = (w, h) -> (w.intValue() | h.intValue()) <= 1080;
        System.out.println("Is image less than max 1080 pixels in length or width: " +lessThanMaxInstaSize.test(width, height));

        //#4
        // Consumer functional interface
        List<String> aspectRatios = Arrays.asList("16:9 Landscape", "1:1 Square", "4:5 Vertical", "2:3 Vertical", "9:16 Full Portrait");
        aspectRatios.forEach(ratio -> System.out.println(ratio));

        // #5 Supplier
        Supplier<Double> PI = () -> Math.PI;
        System.out.println(PI.get());

        // #6 Predicate
        Predicate<Integer> lessThanMax = a -> (a < width);
        System.out.println(lessThanMax.test(4200));

        // #7 Function
        Function<Integer, Integer> doubleWidth = w -> w*2;
        System.out.println(doubleWidth.apply(width));

        // #8 Double to Int
        DoubleToIntFunction pixelToWidth = p -> (int)(p/ height);
        System.out.println(pixelToWidth.applyAsInt(width));

        // #9 Unary operator
        UnaryOperator<Integer> multiplyTen = p -> p*10;
        System.out.println(multiplyTen.apply(totalPixel));

        // #10 Double Consumer
        DoubleConsumer pixel = (p) -> System.out.println((p*3)/(1024*1024));
        pixel.accept(width);

    }
}