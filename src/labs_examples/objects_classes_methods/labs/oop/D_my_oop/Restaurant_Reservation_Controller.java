package labs_examples.objects_classes_methods.labs.oop.D_my_oop;

import java.util.ArrayList;
import java.util.Scanner;

public class Restaurant_Reservation_Controller implements Reservations {

    public static void main(String[] args) {
        reservationBookings();
        checkReservations();
    }

    // objects
    //  reservation interface
    //  seater tables inherited from table - table (no. of seats, indoor / outdoor, int available timeslots) - done

    // methods
    //  occupied / check availability - look in available array for timeslot, check each table objects
    //  make table reservations (time , people) - add table to bookedTable array

    public static void checkReservations() {
        // check booking name against reservation

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter booking name :");
        String booking_name = scan.next();

        for (TwoSeaterTable i : available_2_seats) {
            if(booking_name == i.getBookingName()){
                System.out.println("Booking confirmed");
            }
        }
    }

    public void reservationBookings(){
        // search array and return available array to select timeslot
        // get seatMethod
        // populate 2nd array of available table objects
        // for each ask table in array, have you this time available?

        ArrayList<TwoSeaterTable> booked_2_seats;
        ArrayList<FourSeaterTable> booked_4_seats;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of people for table reservation: ");
        int tableQty = scanner.nextInt();

        // for table of 2;
        if (tableQty==2){
            System.out.println("List of available tables for two people");
                for (TwoSeaterTable n : getAvailable_2_seats){
                    System.out.println(n);
                }
            Scanner input = new Scanner(System.in);
            System.out.println("Enter selected time (24hr e.g. 1930): ");
            int selectedTwoPersonTable = input.nextInt();

            // check each table for timeslot argument
            // if available, take booking name & add table obj to booked_2_seats array

                for (TwoSeaterTable n : getAvailable_2_seats()) {
                    if (TwoSeaterTable.getTimeSlot == selectedTwoPersonTable) {
                        Scanner name = new Scanner(System.in);
                        System.out.println("Enter booking name: ");
                        TwoSeaterTable.setBookingName = input.next();

                        booked_2_seats.add(n);
                        break;
                    }
                }
        }
        // for table of 4
        // else if
}
