package labs_examples.objects_classes_methods.labs.oop.B_polymorphism;

import java.util.Scanner;

import static java.lang.System.out;

public class Guesthouse implements Checkin {
    String guesthouseName;
    String location;
    int numberOfRooms;
    int starRating;

    public Guesthouse(String guesthouseName, String location, int numberOfRooms, int starRating) {
        this.guesthouseName = guesthouseName;
        this.location = location;
        this.numberOfRooms = numberOfRooms;
        this.starRating = starRating;
    }

    public Guesthouse(String guesthouseName, String location, int numberOfRooms) {
        this.guesthouseName = guesthouseName;
        this.location = location;
        this.numberOfRooms = numberOfRooms;
    }

    @Override
    public int reserveRoom() {
        Scanner room = new Scanner(System.in);
        out.println("Select room number: ");
        int roomNumber = room.nextInt();
        return roomNumber;
    }

    @Override
    public void bookBreakfast(int roomNumber) {
    System.out.println("Remind guests that breakfast is served 7 -10am in the lounge");
    }

    @Override
    public void carryLuggage() {
    System.out.println("Tell guests that rooms are down the hall");
    }
}
