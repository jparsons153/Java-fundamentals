package labs_examples.objects_classes_methods.labs.oop.B_polymorphism;

import java.util.ArrayList;

public class HolidayStayController {

    public static void main(String[] args) {

        ArrayList<Integer> roomsOccupied = new ArrayList<>();

        Hotel IbisBournemouth = new Hotel("Bournemouth", 80, 4);
        int reservedRoomNumber = IbisBournemouth.reserveRoom();
        IbisBournemouth.bookBreakfast(reservedRoomNumber);
        IbisBournemouth.carryLuggage();
    }
}
