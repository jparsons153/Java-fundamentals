package labs_examples.objects_classes_methods.labs.objects;

// updated exercise_01 for exercise_02 & exercise_05

public class Exercise_01 {
    public static void main(String[] args) {


        Airplane Boeing747 = new Airplane("Boeing", "747", 113000, 64.4, 238840, 50);
        System.out.println(Boeing747.toString());

        Airplane AirbusA380 = new Airplane("Airbus", "A380", 150000);
        System.out.println(AirbusA380.toString());

    }

    static class Make {
        private String planeModel;

        public Make(String planeModel) {
            this.planeModel = planeModel;
        }

        public String getPlaneModel() {
            return planeModel;
        }

        public void setPlaneModel(String planeModel) {
            this.planeModel = planeModel;
        }

        @Override
        public String toString() {
            return "Make{" +
                    "planeModel='" + planeModel + '\'' +
                    '}';
        }
    }

    static class PlaneEngine {
        private String engineModel;

        public PlaneEngine(String engineModel) {
            this.engineModel = engineModel;
        }

        public String getEngineModel() {
            return engineModel;
        }

        public void setEngineModel(String engineModel) {
            this.engineModel = engineModel;
        }

        @Override
        public String toString() {
            return "PlaneEngine{" +
                    "engineModel='" + engineModel + '\'' +
                    '}';
        }
    }

    static class Payload {
        private double payload;

        public Payload(double payload) {
            this.payload = payload;
        }

        public double getPayload() {
            return payload;
        }

        public void setPayload(double payload) {
            this.payload = payload;
        }

        @Override
        public String toString() {
            return "Payload{" +
                    "payload=" + payload +
                    '}';
        }
    }

    static class Wingspan {
        private double totalLength;

        public Wingspan(double totalLength) {
            this.totalLength = totalLength;
        }

        public double getTotalLength() {
            return totalLength;
        }

        public void setTotalLength(double totalLength) {
            this.totalLength = totalLength;
        }

        @Override
        public String toString() {
            return "Wingspan{" +
                    "totalLength=" + totalLength +
                    '}';
        }
    }

    static class Airplane {
        String make;
        String engine;
        int payload;
        double wingspan;
        double fuelCapacity;
        int currentFuelCapacity_percent;

        public Airplane(String make, String engine, int payload) {
            this.make = make;
            this.engine = engine;
            this.payload = payload;

        }

        public Airplane(String make, String engine, int payload, double wingspan, double fuelCapacity, int currentFuelCapacity_percent) {
            this.make = make;
            this.engine = engine;
            this.payload = payload;
            this.wingspan = wingspan;
            this.fuelCapacity = fuelCapacity;
            this.currentFuelCapacity_percent = currentFuelCapacity_percent;

        }
        @Override
        public String toString() {
            return "Airplane{" +
                    "make='" + make + '\'' +
                    ", engine='" + engine + '\'' +
                    ", payload=" + payload +
                    '}';
        }
    }
            }

