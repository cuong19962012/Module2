package furuma_resort.repository.imp;

import furuma_resort.model.booking.Booking;
import furuma_resort.model.person.Customer;
import furuma_resort.repository.IPromotionRepository;
import furuma_resort.utils.comparator.ComparatorCustomer;
import ss12_java_collection_framework.thuc_hanh.create_binary_search_tree.Tree;

import java.util.*;

public class PromotionRepository implements IPromotionRepository {
    private static BookingRepository bookingRepository = new BookingRepository();
    private static Set<Booking> dataBooking = bookingRepository.getData();
    private static Set<Customer> dataCustomerUseService = new TreeSet<>(new ComparatorCustomer());
    private static final String VOUCHER_10 = "Voucher 10%";
    private static final String VOUCHER_20 = "Voucher 20%";
    private static final String VOUCHER_50 = "Voucher 50%";

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
        for (Booking c : dataBooking) {
            String dateBooking = c.getDateBooking();
            String strYear = "" + dateBooking.charAt(6) + dateBooking.charAt(7) + dateBooking.charAt(8) + dateBooking.charAt(9);
            if (strYear.equals(String.valueOf(year)))
                dataCustomerUseService.add(c.getIdCustomer());
        }
        return dataCustomerUseService;
    }

    @Override
    public HashMap<Customer, String> getCustomerWhoGetVoucher(int voucher10, int voucher20, int voucher50) {
        HashMap<Customer, String> dataCustomerGetVoucher = new HashMap<>();
        Stack<Booking> stack = new Stack<>();
        for (Booking b : dataBooking) {
            stack.push(b);
        }
        if (voucher10 >= stack.size()) {
            for (Booking b : stack) {
                dataCustomerGetVoucher.put(stack.pop().getIdCustomer(), VOUCHER_10);
            }
        }else if(voucher20+voucher10>= stack.size())
        {

        }
        return dataCustomerGetVoucher;
    }
}
