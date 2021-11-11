package labs_examples.objects_classes_methods.labs.oop.D_my_oop;

import java.util.ArrayList;
import java.util.Scanner;

public class Restaurant_Reservation_Controller implements Reservations {

    static ArrayList<TwoSeaterTable> available_2_seats = new ArrayList();
    static ArrayList<FourSeaterTable> available_4_seats = new ArrayList();
    static ArrayList<TwoSeaterTable> booked_2_seats = new ArrayList();
    static ArrayList<FourSeaterTable> booked_4_seats = new ArrayList();

    public static void main(String[] args) {
        Restaurant_Reservation_Controller obj = new Restaurant_Reservation_Controller();

        obj.twoSeatTableNumbers();
        obj.fourSeatTableNumbers();
        obj.reservationBookings();
        obj.checkReservations();
    }


   @Override
    public void reservationBookings() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of people for table reservation: ");
        int tableQty = scanner.nextInt();

        // for table of 2;
        if (tableQty == 2) {
            System.out.println("List of available tables for two people");
            for (TwoSeaterTable i : available_2_seats) {
                System.out.println(i);
            }
                Scanner input = new Scanner(System.in);
                System.out.println("Enter selected time (1800 or 2000): ");
            for (TwoSeaterTable i : available_2_seats){
                if(i.getTimeSlot() == (input.nextInt())){
                    Scanner name = new Scanner(System.in);
                    System.out.println("Enter booking name: ");
                    i.setBookingName(name.next());
                    booked_2_seats.add(i);
                    System.out.println("Table booked");
                    break;
                }
            }
        }

        // for table of 4
        else if (tableQty == 4) {
            System.out.println("List of available tables for four people");
            for (FourSeaterTable j : available_4_seats) {
                System.out.println(j);
            }
                Scanner input = new Scanner(System.in);
                System.out.println("Enter selected time (1800 or 2000): ");
            for (FourSeaterTable j : available_4_seats) {
                if (j.getTimeSlot() == (input.nextInt())) {
                    Scanner name2 = new Scanner(System.in);
                    System.out.println("Enter booking name: ");
                    j.set_BookingName(name2.next());
                    booked_4_seats.add(j);
                    System.out.println("Table booked");
                    break;
                }
            }
        }
    }

    @Override
    public void checkReservations() {
    // check booking name against reservation

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter booking name :");
        String booking_name = scan.next();

        for (TwoSeaterTable i : booked_2_seats) {
            if(booking_name == i.getBookingName()){
                System.out.println("Booking confirmed for 2 persons");
            }
            System.out.println("Tables booked for Two People for tonight :");
            System.out.println(i);
        }

        for (FourSeaterTable j : booked_4_seats) {
            if(booking_name == j.getBookingName()){
                System.out.println("Booking confirmed for 4 persons");
            }
            System.out.println("Tables booked for Four People for tonight :");
            System.out.println(j);
        }
    }

    @Override
    public void twoSeatTableNumbers() {

        // add available 2 seater tables to arraylist
        TwoSeaterTable table1_1800 = new TwoSeaterTable(1,1800);
        TwoSeaterTable table1_2000 = new TwoSeaterTable(1,2000);
        TwoSeaterTable table3_1800 = new TwoSeaterTable(3, 1800);
        TwoSeaterTable table3_2000 = new TwoSeaterTable(3, 2000);
        TwoSeaterTable table5_1800 = new TwoSeaterTable(5, 1800);
        TwoSeaterTable table5_2000 = new TwoSeaterTable(5, 2000);

        available_2_seats.add(table1_1800);
        available_2_seats.add(table1_2000);
        available_2_seats.add(table3_1800);
        available_2_seats.add(table3_2000);
        available_2_seats.add(table5_1800);
        available_2_seats.add(table5_2000);

    }

    @Override
    public void fourSeatTableNumbers(){

        // add available 4 seater tables to arraylist
        FourSeaterTable table2_1800 = new FourSeaterTable(4,1800);
        FourSeaterTable table2_2000 = new FourSeaterTable(4,2000);
        FourSeaterTable table4_1800 = new FourSeaterTable(4,1800);
        FourSeaterTable table4_2000 = new FourSeaterTable(4,2000);

        available_4_seats.add(table2_1800);
        available_4_seats.add(table2_2000);
        available_4_seats.add(table4_1800);
        available_4_seats.add(table4_2000);
    }
}
