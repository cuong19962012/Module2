package furuma_resort.repository;

import furuma_resort.model.booking.Booking;

import java.util.Set;

public interface IBookingRepository {
    Set<Booking> getData();

    boolean check(String id);

    void add(Booking booking);

}
