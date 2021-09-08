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

    public void getFood() {
        System.out.println("Getting food for the Animals");
    }
}

    class Mammals extends Animals {
        public Mammals(int zone, boolean eaten, int numberOfLegs, boolean teeth, boolean nails) {
            super(zone, eaten, numberOfLegs, teeth, nails);
        }

        @Override
        public void getFood() {
            System.out.println("Getting food for the Mammals");
        }
    }

    class Carnivores extends Mammals {
        private String favouriteMeat;

        public Carnivores(int zone, boolean eaten, int numberOfLegs, boolean teeth, boolean nails, String favouriteMeat) {
            super(zone, eaten, numberOfLegs, teeth, nails);
            this.favouriteMeat = favouriteMeat;
        }

        @Override
        public void getFood() {
            System.out.println("Getting game meat for the Carnivores");
        }
    }

    class Cheetah extends Carnivores {
        private String name;
        private String maleOrFemale;
        private int age;

        public Cheetah(int zone, boolean eaten, int numberOfLegs, boolean teeth, boolean nails, String favouriteMeat, String name, String maleOrFemale, int age) {
            super(zone, eaten, numberOfLegs, teeth, nails, favouriteMeat);
            this.name = name;
            this.maleOrFemale = maleOrFemale;
            this.age = age;
        }

        @Override
        public void getFood() {
            System.out.println("Getting rabbit meat for the Cheetah");
        }
    }


/* class AnimalList {
    public static void main(String[] args) {


    }
 }

 */




