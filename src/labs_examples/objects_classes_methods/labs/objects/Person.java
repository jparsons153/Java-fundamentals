package labs_examples.objects_classes_methods.labs.objects;

// Exercise_04

public class Person {
    // instance variables
   public int age;
    double height;
    String name;

    // constructors

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", height=" + height +
                ", name='" + name + '\'' +
                '}';
    }

    public Person(int age, double height, String name) {
        this.age = age;
        this.height = height;
        this.name = name;


    }

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Person( String name, int height) {
        this.name = name;
        this.height = height;
    }

}

