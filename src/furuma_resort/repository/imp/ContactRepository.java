package furuma_resort.repository.imp;

import furuma_resort.model.booking.Booking;
import furuma_resort.model.contact.Contact;
import furuma_resort.repository.IContactRepository;

import java.util.*;

public class ContactRepository implements IContactRepository {
    private static List<Contact> data = new LinkedList<>();
    private static BookingRepository bookingRepository = new BookingRepository();
    private static Queue<Booking> dataBookingAfter = new PriorityQueue<>();

    static {
        Set<Booking> dataBooking = bookingRepository.getData();
        for (Booking b : dataBooking) {
            dataBookingAfter.offer(b);
        }
        Contact contact1 = new Contact("HD-1111", dataBookingAfter.poll(), 3000000, 10000000);
        Contact contact2 = new Contact("HD-2222", dataBookingAfter.poll(), 3000000, 10000000);
        data.add(contact1);
        data.add(contact2);
    }

    @Override
    public void add(Contact contact) {
        data.add(contact);
    }

    @Override
    public int check(String idContact) {
        for (Contact c : data) {
            if (c.getIdContact().equals(idContact))
                return data.indexOf(c);
        }
        return -1;
    }

    @Override
    public List<Contact> getData() {
        return data;
    }

    @Override
    public void edit(List<String> arrInfo, int index) throws NumberFormatException {
        if (!arrInfo.get(0).equals(""))
            data.get(index).setIdContact(arrInfo.get(0));
        if (!arrInfo.get(1).equals("null"))
            data.get(index).setDeposit(Long.parseLong(arrInfo.get(1)));
        if (!arrInfo.get(2).equals("null"))
            data.get(index).setTotalPay(Long.parseLong(arrInfo.get(2)));
    }


    @Override
    public Queue<Booking> getDataBooking() {
        return dataBookingAfter;
    }

    @Override
    public Contact getEditContact(int index) {
        return data.get(index);
    }
}
