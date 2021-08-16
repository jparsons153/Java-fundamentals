package labs_examples.objects_classes_methods.labs.methods;

/**
 * Created by ryandesmond - https://codingnomads.co
 */
public class Exercise_01 {

    public static void main(String[] args) {

        // please create the methods as instructed below then
        // call each of those methods from here, within the main()

    multiply(8,4);

    divide(12, 3);
String str = "I don't tell jokes";
    joke(str);
yrsToseconds(1);
    }


    // 1) Create a static multiply() method below that takes two int arguments (int a, int b) and
    //    returns the result of a * b

    public static int multiply( int a, int b){
        return a*b;
    }

    // 2) Create a static divide() method below that takes two int arguments (int a, int b) and
    //    returns the result of a / b

    public static int divide(int a, int b){
        return a/b;
    }

    // 3) Create a static void method that will print of joke of your choice to the console

    public static void joke(String str){
        System.out.println(str);
    }

    // 4) Create a static method that takes in a number in years (int years) as an argument
    //    and returns the number of seconds that number in years represents
    public static int yrsToseconds(int years){return years*365*24*60*60;
    }

    // 5) Create a varargs method that will return the length of the varargs array passed in






}
