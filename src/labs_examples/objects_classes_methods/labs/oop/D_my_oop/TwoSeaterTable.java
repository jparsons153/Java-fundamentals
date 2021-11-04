package labs_examples.objects_classes_methods.labs.oop.D_my_oop;

import java.util.ArrayList;

public class TwoSeaterTable extends Table{
    int numbrSeats;
    String seatingArea;
    int timeSlot;
    //Boolean occasion;
    String bookingName;
    ArrayList<TwoSeaterTable> available_2_seats;

        public TwoSeaterTable(int numbrSeats, String seatingArea, int timeSlot) {
            this.numbrSeats = numbrSeats;
            this.seatingArea = seatingArea;
            this.timeSlot = timeSlot;
        }

        public TwoSeaterTable(int numbrSeats, String seatingArea, int timeSlot, Boolean occasion, String bookingName) {
            this.numbrSeats = numbrSeats;
            this.seatingArea = seatingArea;
            this.timeSlot = timeSlot;
            this.bookingName = bookingName;
        }

    TwoSeaterTable table1_1800 = new TwoSeaterTable(2,"indoor",1800); // replace with inheritance class table1, use super var for set arguments

    TwoSeaterTable table1_2000 = new TwoSeaterTable(2,"indoor",2000);

    TwoSeaterTable table3_1800 = new TwoSeaterTable(2,"indoor",1800);

    TwoSeaterTable table3_2000 = new TwoSeaterTable(2,"indoor",2000);

    TwoSeaterTable table5_1800 = new TwoSeaterTable(2,"indoor",1800);

    TwoSeaterTable table5_2000 = new TwoSeaterTable(2,"indoor",2000);

    public ArrayList<TwoSeaterTable> availableTwoSeatTables (TwoSeaterTable table1_1800, TwoSeaterTable table1_2000, TwoSeaterTable...v){
        available_2_seats.add(table1_1800);
        available_2_seats.add(table1_2000);
        available_2_seats.add(table3_1800);
        available_2_seats.add(table3_2000);
        available_2_seats.add(table5_1800);
        available_2_seats.add(table5_2000);

        return available_2_seats;
    }

    public ArrayList<TwoSeaterTable> getAvailable_2_seats() {
        return available_2_seats;
    }

    public void setAvailable_2_seats(ArrayList<TwoSeaterTable> available_2_seats) {
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
