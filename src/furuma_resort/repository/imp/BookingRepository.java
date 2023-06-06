package furuma_resort.repository.imp;

import furuma_resort.model.booking.Booking;
import furuma_resort.model.facility.Facility;
import furuma_resort.model.person.Customer;
import furuma_resort.model.person.Person;
import furuma_resort.repository.IBookingRepository;
import furuma_resort.repository.ICustomerRepository;
import furuma_resort.repository.IFacilityRepository;
import furuma_resort.utils.comparator.ComparatorBooking;

import java.util.*;

public class BookingRepository implements IBookingRepository {
    private static  Set<Booking> data = new TreeSet<>(new ComparatorBooking());
    private static ICustomerRepository customerRepository = new CustomerRepository();
    private static IFacilityRepository facilityRepository = new FacilityRepository();

    static {
        List<Person> dataCustomer = customerRepository.display();
        Customer customer1 = (Customer) dataCustomer.get(0);
        Map<Facility, Integer> dataFacility = facilityRepository.getData();
        List<Facility> listFacility = new ArrayList<>();
        for (Facility f : dataFacility.keySet()) {
            listFacility.add(f);
        }
        //String idBooking, String dateBooking, String dateStart, String dateEnd, Customer idCustomer, String idService
        Booking booking1 = new Booking("BK-1111", "24-12-2023", "25-12-2022", "26-12-2022", customer1, listFacility.get(0));
        Booking booking2 = new Booking("BK-2222", "24-12-2023", "25-12-2022", "28-12-2022", customer1, listFacility.get(0));
        Booking booking3 = new Booking("BK-3333", "24-12-2023", "25-12-2023", "30-12-2023", customer1, listFacility.get(0));
        data.add(booking1);
        data.add(booking2);
        data.add(booking3);
    }

    @Override
    public Set<Booking> getData() {
        return data;
    }

    @Override
    public boolean check(String id) {
        for (Booking b : data) {
            if (b.getIdBooking().equals(id))
                return true;
        }
        return false;
    }

    @Override
    public void add(Booking booking) {
        data.add(booking);
        System.out.println("Add booking success");
        facilityRepository.maintenance(booking.getIdFacility());
    }
}
