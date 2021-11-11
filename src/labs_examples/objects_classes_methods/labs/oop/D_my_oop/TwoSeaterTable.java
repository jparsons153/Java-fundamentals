package labs_examples.objects_classes_methods.labs.oop.D_my_oop;

import java.util.ArrayList;

public class TwoSeaterTable extends Table{

    String bookingName;

    public TwoSeaterTable(int tableNumber,int timeSlot) {
        this.tableNumber = tableNumber;
        this.numbrSeats = 2;
        this.seatingArea = "indoor";
        this.timeSlot = timeSlot;

    }

    @Override
    public String toString() {
        return "TwoSeaterTable{" +
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

    public void setBookingName(String bookingName) {
        this.bookingName = bookingName;
    }

}
