package labs_examples.objects_classes_methods.labs.oop.D_my_oop;

import java.util.ArrayList;

public class FourSeaterTable extends Table{
    int numbrSeats;
    String seatingArea;
    //Boolean occasion;
    int timeSlot;
    ArrayList<FourSeaterTable> available_4_seats;

    public FourSeaterTable(int numbrSeats, String seatingArea, int timeSlot) {
        this.numbrSeats = numbrSeats;
        this.seatingArea = seatingArea;
        this.timeSlot = timeSlot;
    }

    FourSeaterTable table2_1800 = new FourSeaterTable(4,"indoor",1800);
    FourSeaterTable table2_2000 = new FourSeaterTable(4,"indoor",2000);

    FourSeaterTable table4_1800 = new FourSeaterTable(4,"indoor",1800);
    FourSeaterTable table4_2000 = new FourSeaterTable(4,"indoor",2000);

    public ArrayList<FourSeaterTable> availableFourSeatTables (FourSeaterTable table2_1800, FourSeaterTable table2_2000, FourSeaterTable...v ){
        available_4_seats.add(table2_1800);
        available_4_seats.add(table2_2000);
        available_4_seats.add(table4_1800);
        available_4_seats.add(table4_2000);
    return available_4_seats;
    }

    public ArrayList<FourSeaterTable> getAvailable_4_seats() {
        return available_4_seats;
    }

    public void setAvailable_4_seats(ArrayList<FourSeaterTable> available_4_seats) {
        this.available_4_seats = available_4_seats;
    }
}
