package labs_examples.objects_classes_methods.labs.oop.B_polymorphism;

// Exercise 01 part 01

public class MotorcycleController {

    public static void main(String[] args) {
        Motorcross_bike Scrambler = new Motorcross_bike(300,"Scambler", "dirt");
    Scrambler.putGearOn();
    Scrambler.checkTyrePressure();
    Scrambler.putOnHelmet();

    }
}
