package labs_examples.objects_classes_methods.labs.oop.D_my_oop;

import java.util.ArrayList;

public class TwoSeaterTable extends Table{
    int numbrSeats;
    String seatingArea;
    int timeSlot;
    //Boolean occasion;
    String bookingName;

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

    @Override
    public String toString() {
        return "TwoSeaterTable{" +
                "numbrSeats=" + numbrSeats +
                ", seatingArea='" + seatingArea + '\'' +
                ", timeSlot=" + timeSlot +
                ", bookingName='" + bookingName + '\'' +
                '}';
    }

    public TwoSeaterTable() {
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
