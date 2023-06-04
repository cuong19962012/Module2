package furuma_resort.utils.comparator;

import furuma_resort.model.booking.Booking;

import java.util.Comparator;

public class ComparatorBooking implements Comparator<Booking> {
    @Override
    public int compare(Booking o1, Booking o2) {
        if (o1.getDateStart().equals(o2.getDateStart()))
            return o1.getDateEnd().compareTo(o2.getDateEnd());
        else
            return o1.getDateStart().compareTo(o2.getDateStart());
    }
}
