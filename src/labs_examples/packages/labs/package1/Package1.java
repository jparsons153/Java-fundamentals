package labs_examples.packages.labs.package1;

import static labs_examples.packages.labs.package2.Package2.methodC;

public class Package1 {

    public static void main(String[] args) {
        methodA();
        methodB();

        methodC(); // call methodC from package 2
        // methodD(); // methodD can not be called as in protected access modifier package2
    }

    public static void methodA(){
        System.out.println("Printing from methodA package 1");
    }

    static void methodB(){
        System.out.println("Printing from methodB package 1");
    }
}
