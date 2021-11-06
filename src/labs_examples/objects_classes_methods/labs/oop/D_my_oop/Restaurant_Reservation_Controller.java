package labs_examples.objects_classes_methods.labs.oop.D_my_oop;

import java.util.ArrayList;
import java.util.Scanner;

public class Restaurant_Reservation_Controller implements Reservations {


    @Override
    public void reservationBookings() {

    }

    @Override
    public void checkReservations() {

    }

    public static void main(String[] args) {
                
        ArrayList<TwoSeaterTable> twoTables = twoSeatTableNumbers();
        ArrayList<FourSeaterTable> fourTables = fourSeatTableNumbers();
        reservationBookings(twoTables, fourTables);
        checkReservations(twoTables, fourTables);
    }

    public static void reservationBookings(ArrayList<TwoSeaterTable> available_2_seats, ArrayList<FourSeaterTable> available_4_seats) {

        ArrayList<TwoSeaterTable> booked_2_seats = new ArrayList();
        ArrayList<FourSeaterTable> booked_4_seats = new ArrayList();
        TwoSeaterTable myTwoSeaterTable = new TwoSeaterTable();
        FourSeaterTable myFourSeaterTable = new FourSeaterTable();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of people for table reservation: ");
        int tableQty = scanner.nextInt();

        // for table of 2;
        if (tableQty == 2) {
            System.out.println("List of available tables for two people");
            for (TwoSeaterTable n : available_2_seats) {
                System.out.println(n);
            }
            Scanner input = new Scanner(System.in);
            System.out.println("Enter selected time (1800 or 2000): ");
            int selectedTwoPersonTable = input.nextInt();

            // check each table for timeslot argument
            // if available, take booking name & add table obj to booked_2_seats array

            for (TwoSeaterTable n : available_2_seats) {
                if (myTwoSeaterTable.getTimeSlot() == selectedTwoPersonTable) {
                    Scanner name = new Scanner(System.in);
                    System.out.println("Enter booking name: ");
                    myTwoSeaterTable.setBookingName(name.next());

                    booked_2_seats.add(n);
                    break;
                }
            }
        }
        // for table of 4
        else if (tableQty == 4) {
            System.out.println("List of available tables for four people");
            for (FourSeaterTable n : available_4_seats) {
                System.out.println(n);
            }
            Scanner input = new Scanner(System.in);
            System.out.println("Enter selected time (24hr e.g. 1930): ");
            int selectedFourPersonTable = input.nextInt();

            for (FourSeaterTable j : available_4_seats) {
                if (myFourSeaterTable.getTimeSlot() == selectedFourPersonTable) {
                    Scanner name2 = new Scanner(System.in);
                    System.out.println("Enter booking name: ");
                    myFourSeaterTable.set_BookingName(name2.next()) ;

                    booked_4_seats.add(j);
                    break;
                }
            }
        }
    }

    public static void checkReservations(ArrayList<TwoSeaterTable> booked_2_seats, ArrayList<FourSeaterTable> booked_4_seats) {
        // check booking name against reservation

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter booking name :");
        String booking_name = scan.next();

        for (TwoSeaterTable i : booked_2_seats) {
            if(booking_name == i.getBookingName()){
                System.out.println("Booking confirmed for 2 persons");
            }
        }

        for (FourSeaterTable j : booked_4_seats) {
            if(booking_name == j.getBookingName()){
                System.out.println("Booking confirmed for 4 persons");
            }
        }
    }

    public static ArrayList<TwoSeaterTable> twoSeatTableNumbers() {
        ArrayList<TwoSeaterTable> available_2_seats = new ArrayList();

        // add available 2 seater tables to arraylist
        TwoSeaterTable table1_1800 = new TwoSeaterTable(2, "indoor", 1800); // replace with inheritance class table1, use super var for set arguments
        TwoSeaterTable table1_2000 = new TwoSeaterTable(2, "indoor", 2000);
        TwoSeaterTable table3_1800 = new TwoSeaterTable(2, "indoor", 1800);
        TwoSeaterTable table3_2000 = new TwoSeaterTable(2, "indoor", 2000);
        TwoSeaterTable table5_1800 = new TwoSeaterTable(2, "indoor", 1800);
        TwoSeaterTable table5_2000 = new TwoSeaterTable(2, "indoor", 2000);

        available_2_seats.add(table1_1800);
        available_2_seats.add(table1_2000);
        available_2_seats.add(table3_1800);
        available_2_seats.add(table3_2000);
        available_2_seats.add(table5_1800);
        available_2_seats.add(table5_2000);

        return available_2_seats;
    }

    public static ArrayList<FourSeaterTable> fourSeatTableNumbers(){
        ArrayList<FourSeaterTable> available_4_seats = new ArrayList();

        // add available 4 seater tables to arraylist
        FourSeaterTable table2_1800 = new FourSeaterTable(4,"indoor",1800);
        FourSeaterTable table2_2000 = new FourSeaterTable(4,"indoor",2000);
        FourSeaterTable table4_1800 = new FourSeaterTable(4,"indoor",1800);
        FourSeaterTable table4_2000 = new FourSeaterTable(4,"indoor",2000);

        available_4_seats.add(table2_1800);
        available_4_seats.add(table2_2000);
        available_4_seats.add(table4_1800);
        available_4_seats.add(table4_2000);

        return available_4_seats;
    }
}
