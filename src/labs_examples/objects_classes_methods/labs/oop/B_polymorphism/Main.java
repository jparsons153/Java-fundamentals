package labs_examples.objects_classes_methods.labs.oop.B_polymorphism;

// Exercise 01 part 03 using an interface as an instance variable

public class Main {

    public static void main(String[] args) {
        Motorcross_bike motocross = new Motorcross_bike("Honda","scrambler");
        Cruiser_bike cruiser = new Cruiser_bike(1989, 170);

        InterfaceAsVar morpho = new InterfaceAsVar(motocross);
        morpho.getReady();

        morpho.setMotorcycle(cruiser);
        morpho.getReady();
    }

}