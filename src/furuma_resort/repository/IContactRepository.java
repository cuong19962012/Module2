package furuma_resort.repository;

import furuma_resort.model.booking.Booking;
import furuma_resort.model.contact.Contact;

import java.util.List;
import java.util.Queue;

public interface IContactRepository {
    void add(Contact contact);

    int check(String idContact);

    List<Contact> getData();

    void edit(List<String> arrInfo,int index);

    Queue<Booking> getDataBooking();
    Contact getEditContact(int index);
}
