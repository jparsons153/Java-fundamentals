package labs_examples.objects_classes_methods.labs.oop.D_my_oop;

import java.util.ArrayList;

public class FourSeaterTable extends Table{

    String bookingName;

    public FourSeaterTable(int tableNumber,int timeSlot) {
        this.tableNumber = tableNumber;
        this.numbrSeats = 4;
        this.seatingArea = "indoor";
        this.timeSlot = timeSlot;
    }

    @Override
    public String toString() {
        return "FourSeaterTable{" +
                "tableNumber=" + tableNumber +
                ", numbrSeats=" + numbrSeats +
                ", timeSlot=" + timeSlot +
                ", bookingName='" + bookingName + '\'' +
                '}';
    }

    public int getTimeSlot() {
        return timeSlot;
    }

    public String getBookingName() {
        return bookingName;
    }

    public void set_BookingName(String bookingName) {
        this.bookingName = bookingName;
    }
}
