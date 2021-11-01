package labs_examples.objects_classes_methods.labs.oop.D_my_oop;

import java.util.ArrayList;

public class twoSeaterTable extends Table{
    int numbrSeats;
    String seatingArea;
    int timeSlot;
    //Boolean occasion;
    String bookingName;
    ArrayList<twoSeaterTable> available_2_seats;

        public twoSeaterTable(int numbrSeats, String seatingArea, int timeSlot) {
            this.numbrSeats = numbrSeats;
            this.seatingArea = seatingArea;
            this.timeSlot = timeSlot;
        }

        public twoSeaterTable(int numbrSeats, String seatingArea, int timeSlot, Boolean occasion, String bookingName) {
            this.numbrSeats = numbrSeats;
            this.seatingArea = seatingArea;
            this.timeSlot = timeSlot;
            this.bookingName = bookingName;
        }

    twoSeaterTable table1_1800 = new twoSeaterTable(2,"indoor",1800); // replace with inheritance class table1, use super var for set arguments

    twoSeaterTable table1_2000 = new twoSeaterTable(2,"indoor",2000);

    twoSeaterTable table3_1800 = new twoSeaterTable(2,"indoor",1800);

    twoSeaterTable table3_2000 = new twoSeaterTable(2,"indoor",2000);

    twoSeaterTable table5_1800 = new twoSeaterTable(2,"indoor",1800);

    twoSeaterTable table5_2000 = new twoSeaterTable(2,"indoor",2000);

    public ArrayList<twoSeaterTable> availableTwoSeatTables (twoSeaterTable table1_1800, twoSeaterTable table1_2000, twoSeaterTable...v){
        available_2_seats.add(table1_1800);
        available_2_seats.add(table1_2000);
        available_2_seats.add(table3_1800);
        available_2_seats.add(table3_2000);
        available_2_seats.add(table5_1800);
        available_2_seats.add(table5_2000);

        return available_2_seats;
    }

    public ArrayList<twoSeaterTable> getAvailable_2_seats() {
        return available_2_seats;
    }

    public void setAvailable_2_seats(ArrayList<twoSeaterTable> available_2_seats) {
        this.available_2_seats = available_2_seats;
    }

    public int getTimeSlot() {
        return timeSlot;
    }

    public String getBookingName() {
        return bookingName;
    }

    public void setBookingName(String bookingName) {
        this.bookingName = bookingName;
    }
}
