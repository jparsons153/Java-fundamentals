package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

// oop Exercise 01

public class Zoo {
    private int zone;

    public Zoo() {
    }

    public Zoo(int zone) {
        this.zone = zone;
    }
}

class Animals extends Zoo {
    private boolean eaten;
    private int numberOfLegs;
    private boolean teeth;
    private boolean nails;

    public Animals(int zone, boolean eaten, int numberOfLegs, boolean teeth, boolean nails) {
        super(zone);
        this.eaten = eaten;
        this.numberOfLegs = numberOfLegs;
        this.teeth = teeth;
        this.nails = nails;
    }
}

class Mammals extends Animals {
    public Mammals(int zone, boolean eaten, int numberOfLegs, boolean teeth, boolean nails) {
        super(zone, eaten, numberOfLegs, teeth, nails);
    }
}

class AnimalList {
    public static void main(String[] args) {
        Mammals chettah = new Mammals(1,true,4,true,true);
    }
}




