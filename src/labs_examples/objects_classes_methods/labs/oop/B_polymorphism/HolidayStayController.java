package labs_examples.objects_classes_methods.labs.oop.B_polymorphism;

import java.util.ArrayList;

// Exercise 01 part 02

public class HolidayStayController {

    public static void main(String[] args) {

        Hotel IbisBournemouth = new Hotel("Bournemouth", 80, 4);
        int reservedRoomNumber = IbisBournemouth.reserveRoom();
        IbisBournemouth.bookBreakfast(reservedRoomNumber);
        IbisBournemouth.carryLuggage();

        Guesthouse AvonGuesthouse = new Guesthouse("Avon B&B", "Inverness", 12);
        int reservedRoomNo = AvonGuesthouse.reserveRoom();
        AvonGuesthouse.bookBreakfast(reservedRoomNumber);
        AvonGuesthouse.carryLuggage();
    }
}
