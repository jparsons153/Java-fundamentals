package labs_examples.objects_classes_methods.labs.objects;

class Vehicle {
    String model;
    public Vehicle(String model){
        this.model = model;
    }
}

class Person1 {
    String name;
    public Person1(String name){
        this.name = name;
    }
}

public class PersonVehicleAssociation {
    public static void main(String[] args) {
        Vehicle v = new Vehicle("XTerra");
        Person1 p = new Person1("Kim");
        System.out.println(p.name + " drives an " + v.model);
    }
}
