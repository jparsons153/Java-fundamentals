package labs_examples.objects_classes_methods.labs.oop.D_my_oop;

import java.util.ArrayList;

public class FourSeaterTable extends Table{
    int numbrSeats;
    String seatingArea;
    //Boolean occasion;
    int timeSlot;
    String bookingName;

    public FourSeaterTable(int numbrSeats, String seatingArea, int timeSlot) {
        this.numbrSeats = numbrSeats;
        this.seatingArea = seatingArea;
        this.timeSlot = timeSlot;
    }

    public FourSeaterTable() {
    }

    public int getNumbrSeats() {
        return numbrSeats;
    }

    public void setNumbrSeats(int numbrSeats) {
        this.numbrSeats = numbrSeats;
    }

    public int getTimeSlot() {
        return timeSlot;
    }

    public void setTimeSlot(int timeSlot) {
        this.timeSlot = timeSlot;
    }

    public String getBookingName() {
        return bookingName;
    }

    public void set_BookingName(String bookingName) {
        this.bookingName = bookingName;
    }
}
