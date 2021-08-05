package labs_examples.datatypes_operators.labs;

/**
 * Fundamentals Exercise 4: Volume and Surface Area
 *
 *      Write the necessary code to calculate the volume and surface area of a cylinder
 *      with a radius of 3.14 and a height of 5. Print out the result.
 *
 */

public class Exercise_06 {

    public static void main(String[] args) {

        // write code here

        double pie = 3.14;
        double radius = 3.14;
        double height = 5;

        // volume calculation
        double volume = pie*radius*radius*height;

        System.out.println("volume of cylinder with a radius of " + radius + " and a height of " + height + " = " + volume);

        // surface area calculation
        double surface_area = 2*pie*radius*(height + radius);

        System.out.println("surface area of cylinder with a radius of " + radius + " and a height of " + height + " = " + surface_area);

    }
}