package labs_examples.objects_classes_methods.labs.oop.B_polymorphism;

public class Cruiser_bike implements Motorcycle {
    private int yearOfManufacture;
    private int rearTyreWidth;

    public Cruiser_bike(int yearOfManufacture, int rearTyreWidth) {
        this.yearOfManufacture = yearOfManufacture;
        this.rearTyreWidth = rearTyreWidth;
    }

    @Override
    public void putGearOn() {
        System.out.println("Putting on leathers");
    }

    @Override
    public void checkTyrePressure() {
        System.out.println("Checking tyre pressure");
    }

    @Override
    public void putOnHelmet() {
        System.out.println("Cool sunglasses and open face helmet on");
    }
}