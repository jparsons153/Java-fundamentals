package labs_examples.objects_classes_methods.labs.oop.D_my_oop;

import java.util.ArrayList;

public class fourSeaterTable extends Table{
    int numbrSeats;
    String seatingArea;
    //Boolean occasion;
    int timeSlot;
    ArrayList<fourSeaterTable> available_4_seats;

    public fourSeaterTable(int numbrSeats, String seatingArea, int timeSlot) {
        this.numbrSeats = numbrSeats;
        this.seatingArea = seatingArea;
        this.timeSlot = timeSlot;
    }

    fourSeaterTable table2_1800 = new fourSeaterTable(4,"indoor",1800);
    fourSeaterTable table2_2000 = new fourSeaterTable(4,"indoor",2000);

    fourSeaterTable table4_1800 = new fourSeaterTable(4,"indoor",1800);
    fourSeaterTable table4_2000 = new fourSeaterTable(4,"indoor",2000);

    public ArrayList<fourSeaterTable> availableFourSeatTables (fourSeaterTable table2_1800,fourSeaterTable table2_2000,fourSeaterTable...v ){
        available_4_seats.add(table2_1800);
        available_4_seats.add(table2_2000);
        available_4_seats.add(table4_1800);
        available_4_seats.add(table4_2000);
    return available_4_seats;
    }

    public ArrayList<fourSeaterTable> getAvailable_4_seats() {
        return available_4_seats;
    }

    public void setAvailable_4_seats(ArrayList<fourSeaterTable> available_4_seats) {
        this.available_4_seats = available_4_seats;
    }
}
