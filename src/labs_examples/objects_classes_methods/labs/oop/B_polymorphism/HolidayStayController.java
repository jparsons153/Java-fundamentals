package labs_examples.objects_classes_methods.labs.oop.B_polymorphism;

public class HolidayStayController {

    public static void main(String[] args) {

        Hotel IbisBournemouth = new Hotel("Bournemouth", 80, 4);
        IbisBournemouth.reserveRoom();
        IbisBournemouth.bookBreakfast(); // how to pass value from reserveRoom method?
        IbisBournemouth.carryLuggage();
    }
}
