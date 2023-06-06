package furuma_resort.repository.imp;

import furuma_resort.model.booking.Booking;
import furuma_resort.model.person.Customer;
import furuma_resort.repository.IBookingRepository;
import furuma_resort.repository.IPromotionRepository;
import furuma_resort.utils.comparator.ComparatorCustomer;

import java.time.LocalDate;
import java.util.*;

public class PromotionRepository implements IPromotionRepository {
    private static final IBookingRepository bookingRepository = new BookingRepository();
    private static final Set<Booking> dataBooking = bookingRepository.getData();
    private static final Set<Customer> dataCustomerUseService = new TreeSet<>(new ComparatorCustomer());


    static {
        // dataBooking
//        for (Booking c : dataBooking) {
//            String dateBooking = c.setDateBooking();
//            String strYear =
//            if ()
//        }
        //dataCustomerUseService.add()
    }

    @Override
    public Set<Customer> getCustomerUseService(int year) {
        for (Booking b : dataBooking) {
            String dateBooking = b.getDateBooking();
            String strYear = "" + dateBooking.charAt(6) + dateBooking.charAt(7) + dateBooking.charAt(8) + dateBooking.charAt(9);
            if (strYear.equals(String.valueOf(year)))
                dataCustomerUseService.add(b.getIdCustomer());
        }
        return dataCustomerUseService;
    }

    @Override
    public Stack<Booking> getBooking() {
        // HashMap<Customer, String> dataCustomerGetVoucher = new HashMap<>();
        List<String> dataCustomerGetVoucher = new LinkedList<>();
        Stack<Booking> stack = new Stack<>();

        for (Booking b : dataBooking) {
            String year = "" + b.getDateBooking().charAt(6) + b.getDateBooking().charAt(7) + b.getDateBooking().charAt(8) + b.getDateBooking().charAt(9);
            if (year.equals(String.valueOf(LocalDate.now().getYear())))
                stack.push(b);
        }

        return stack;
    }

    @Override
    public int checkBooking() {
        return dataBooking.size();
    }
}
