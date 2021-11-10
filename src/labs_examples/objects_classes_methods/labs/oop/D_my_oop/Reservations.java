package labs_examples.objects_classes_methods.labs.oop.D_my_oop;

import java.util.ArrayList;

public interface Reservations {
     public void reservationBookings();
     public void checkReservations();
     public default void twoSeatTableNumbers(){}
     public default void fourSeatTableNumbers(){}
}
