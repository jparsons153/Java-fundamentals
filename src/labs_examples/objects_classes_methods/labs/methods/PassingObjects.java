package labs_examples.objects_classes_methods.labs.methods;

import labs_examples.objects_classes_methods.labs.objects.Person;

// Exercise 02 2) pass by reference

public class PassingObjects {
    public static void main(String[] args) {
        Person john = new Person(32, 65, "John");
        System.out.println(john.toString());

        addYearToPerson(john);
        System.out.println(john.toString());
    }

    public static void addYearToPerson(Person john) {
        john.age = john.age + 1;
    }
}
