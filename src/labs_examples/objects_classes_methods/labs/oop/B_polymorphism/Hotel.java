package labs_examples.objects_classes_methods.labs.oop.B_polymorphism;

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.out;

public class Hotel implements Checkin {
String location;
int numberOfRooms;
int starRating;

    public Hotel(String location, int numberOfRooms, int starRating) {
        this.location = location;
        this.numberOfRooms = numberOfRooms;
        this.starRating = starRating;
    }

    public Hotel(String location, int numberOfRooms) {
        this.location = location;
        this.numberOfRooms = numberOfRooms;
    }

    @Override
    public int reserveRoom() {
        ArrayList<Integer> roomsOccupied = new ArrayList<>();
        Scanner room = new Scanner(System.in);
        out.println("Select room number: ");
        int roomNumber = room.nextInt();
        roomsOccupied.add(roomNumber);
        return roomNumber;
    }

    @Override
    public void bookBreakfast(int roomNumber) {
        ArrayList<Integer> breakfastList = new ArrayList<>();
        System.out.println("Request if guests would like breakfast");
        Scanner in = new Scanner(System.in);
        out.println("Breakfast required, enter True or False");
        boolean breakfast = in.nextBoolean();
        if(breakfast=true){
            breakfastList.add(roomNumber);
        }
    }

    @Override
    public void carryLuggage() {
    System.out.println("Call hotel porter to reception");
    }
}
