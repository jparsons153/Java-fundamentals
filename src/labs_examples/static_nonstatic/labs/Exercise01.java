package labs_examples.static_nonstatic.labs;

public class Exercise01 {

    public static void main(String[] args) {

    // 01) Static method calling another static method in the same class
        staticmethod();

    // 02) Static method calling non-static method in the same class
        Exercise01 obj = new Exercise01();
        obj.nonstaticmethod();

    // 03) Static method calling a static method in another class
        StaticMethodCall.methodA();

    // 04) A static method calling a non-static method in another class
    // 05) A non-static method calling a non-static method in the same class
        NonStaticMethodCall object = new NonStaticMethodCall();
        object.methodB();

    }

    public static void staticmethod () {
        System.out.println("Calling static method from static method");
    }

    public void nonstaticmethod () {
        System.out.println("Calling non-static method from static");
    }

}

class StaticMethodCall{
    public static void methodA(){
        System.out.println("Calling static method from another class");
    }
}

class NonStaticMethodCall{
    public void methodB(){
        System.out.println("Calling non-static method from another class");
    nonstaticToNonStatic();

    // 06) A non-static method calling a non-static method in another class

    MethodCall anotherobj = new MethodCall();
    anotherobj.methodC();

    // 07) A non-static method calling a static method in the same class
    nonstaticToStatic();

    // 08) A non-static method calling a static method in another class
        StaticMethodCall.methodA();
    }

    private void nonstaticToNonStatic() {
        System.out.println("Calling non-static from non-static");
    }

    private static void nonstaticToStatic(){
        System.out.println("Calling static method from non-static method");
    }

}

class MethodCall{
    public void methodC(){
        System.out.println("Calling non-static method from another non-static class");
    }
}