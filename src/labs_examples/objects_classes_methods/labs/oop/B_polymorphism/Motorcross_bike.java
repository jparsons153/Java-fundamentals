package labs_examples.objects_classes_methods.labs.oop.B_polymorphism;

// Exercise 01 part 01

public class Motorcross_bike implements Motorcycle {
    private int cc;
    private String make;
    private String model;

    public Motorcross_bike(int cc, String make, String model) { //overloading
        this.cc = cc;
        this.make = make;
        this.model = model;
    }

    public Motorcross_bike(String make, String model) {
        this.make = make;
        this.model = model;
    }

    @Override
    public void putGearOn() { //overriding
        System.out.println("Putting on rigger boots");
    }

    @Override
    public void checkTyrePressure() {
        System.out.println("checking tyre pressures for knobbly tyres");
    }

    @Override
    public void putOnHelmet() {
        System.out.println("putting on helmet and googles");
    }
}
