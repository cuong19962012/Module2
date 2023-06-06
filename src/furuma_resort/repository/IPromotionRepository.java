package furuma_resort.repository;

import furuma_resort.model.booking.Booking;
import furuma_resort.model.person.Customer;

import java.util.*;

public interface IPromotionRepository {

    Set<Customer> getCustomerUseService(int year);

    Stack<Booking> getBooking();

    int checkBooking();
}
