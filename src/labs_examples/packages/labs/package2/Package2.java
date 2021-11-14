package labs_examples.packages.labs.package2;

public class Package2 {
    public static void main(String[] args) {
        methodC();
        methodD();
    }

    public static void methodC(){
        System.out.println("Printing from methodC package 2");
    }

    static void methodD(){
        System.out.println("Printing from methodD package 2");
    }
}
