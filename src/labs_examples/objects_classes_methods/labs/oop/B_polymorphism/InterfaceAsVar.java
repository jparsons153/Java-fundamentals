package labs_examples.objects_classes_methods.labs.oop.B_polymorphism;

// Exercise 01 part 03 using an interface as an instance variable

public class InterfaceAsVar {
    Motorcycle bike;

    public InterfaceAsVar(Motorcycle bike) {
        this.bike = bike;
    }

    public void setMotorcycle(Motorcycle bike) { //setter using Motorcycle rather than bike
        this.bike = bike;
    }

    public void getReady() {
        bike.putGearOn();
        bike.checkTyrePressure();
        bike.putOnHelmet();
    }
}