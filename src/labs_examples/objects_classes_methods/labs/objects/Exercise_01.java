package labs_examples.objects_classes_methods.labs.objects;

public class Exercise_01 {
    public static void main(String[] args){

    Manufacturer manufacturer = new Manufacturer ("Bowing");
    PlaneEngine engineModel = new PlaneEngine("747");
    Payload payload = new Payload( 120);
    Wingspan wingspan = new Wingspan (300);

    Airplane Bowing747 = new Airplane(manufacturer, engineModel,120, 300, 100, 50);
System.out.println(Bowing747.toString());
    }

    static class Manufacturer {
        String planeModel;
        public Manufacturer(String planeModel){
            this.planeModel = planeModel;
        }

        @Override
        public String toString() {
            return "manufacturer{" +
                    "planeModel='" + planeModel + '\'' +
                    '}';
        }
    }
    }

    class PlaneEngine {
        String engineModel;
        public PlaneEngine(String engineModel){
            this.engineModel = engineModel;
        }
        @Override
        public String toString() {
            return "Engine{" +
                    "engineModel='" + engineModel + '\'' +
                    '}';
        }
    }

    class Payload{
    double payload;
    public Payload(double payload){
        this.payload = payload;
    }
    }

    class Wingspan{
    double totalLength;
    public Wingspan(double totalLength){
        this.totalLength = totalLength;
    }
    }

    class Airplane{
    Exercise_01.Manufacturer manufacturer;
    PlaneEngine engine;
    int payload;
    int wingspan;
    double fuelCapacity;
    int currentFuelLevel;

    public Airplane(Exercise_01.Manufacturer manufacturer, PlaneEngine engine, int payload, int wingspan, double fuelCapacity, int currentFuelLevel){
        this.manufacturer = manufacturer;
        this.engine = engine;
        this.payload = payload;
        this.wingspan = wingspan;
        this.fuelCapacity = fuelCapacity;
        this.currentFuelLevel = currentFuelLevel;
    }

        @Override
        public String toString() {
            return "Airplane{" +
                    "manufacturer=" + manufacturer +
                    ",\n engine=" + engine +
                    ",\n  payload=" + payload +
                    ",\n  wingspan=" + wingspan +
                    ",\n  fuelCapacity=" + fuelCapacity +
                    ",\n  currentFuelLevel=" + currentFuelLevel +
                    '}';
        }
    }


