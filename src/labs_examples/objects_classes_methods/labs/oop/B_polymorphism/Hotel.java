package labs_examples.objects_classes_methods.labs.oop.B_polymorphism;

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.out;

// Exercise 01 part 02

public class Hotel implements Checkin {
String location;
int numberOfRooms;
int starRating;

    public ArrayList<Integer> roomsOccupied = new ArrayList<>(); // define arraylists
    public ArrayList<Integer> breakfastList = new ArrayList<>();

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
    public String toString() {
        return "Hotel{" +
                "location='" + location + '\'' +
                ", numberOfRooms=" + numberOfRooms +
                ", starRating=" + starRating +
                '}';
    }

    @Override
    public int reserveRoom() {
        System.out.println(toString());
        Scanner room = new Scanner(System.in);
        out.println("Select room number: ");
        int roomNumber = room.nextInt();
        if (roomNumber<numberOfRooms){
            roomsOccupied.add(roomNumber);}
        else System.out.println("Enter a room number less than " +numberOfRooms);
        return roomNumber;
    }

    @Override
    public void bookBreakfast(int roomNumber) {
        System.out.println("Request if guests would like breakfast");
        Scanner in = new Scanner(System.in);
        out.println("Breakfast required, enter True or False");
        boolean breakfast = in.nextBoolean();
        if(breakfast=true){
            breakfastList.add(roomNumber);
            System.out.println("Breakfast booking successful");
        }
    }

    @Override
    public void carryLuggage() {
    System.out.println("Call hotel porter to reception");
    }
}
