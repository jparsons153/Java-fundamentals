package labs_examples.objects_classes_methods.labs.objects;

class Vehicle {
    String model;
    public Vehicle(String model){
        this.model = model;
    }
}

class Person {
    String name;
    public Person(String name){
        this.name = name;
    }
}

public class PersonVehicleAssociation {
    public static void main(String[] args) {
        Vehicle v = new Vehicle("XTerra");
        Person p = new Person("Kim");
        System.out.println(p.name + " drives an " + v.model);
    }
}
