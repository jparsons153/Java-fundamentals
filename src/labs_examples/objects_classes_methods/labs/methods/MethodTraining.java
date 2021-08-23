package labs_examples.objects_classes_methods.labs.methods;

public class MethodTraining {
// 1) method overloading

    public static int addition(int a, int b) {
        return a + b;
    }

    public static int addition(int a, int b, int c) {
        return a + b + c;
    }

    public static int addition(double a, double b, double c) {
        return ((int) (a + b + c));
    }
}

// 2) pass by value vs pass by reference
// pass by value
class PassingValues {
    public static void main(String[] args) {
        double a = 12;
        double b = 14;

        System.out.println("before a:" + a);
        System.out.println("before b:" + b);

        someOtherMethod(a, b);

        System.out.println("before a:" + a);
        System.out.println("before b:" + b);
    }

    public static void someOtherMethod(double a, double b) {
        a = a * 10;
        System.out.println(a);
        b = b * 20;
        System.out.println(b);
    }
}





