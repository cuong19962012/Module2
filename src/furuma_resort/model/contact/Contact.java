package furuma_resort.model.contact;

import furuma_resort.model.booking.Booking;

import java.util.Objects;

public class Contact {
    private String idContact;
    private Booking idBooking;
    private long deposit;
    private long totalPay;

    public Contact(String idContact, Booking idBooking, long deposit, long totalPay) {
        this.idContact = idContact;
        this.idBooking = idBooking;
        this.deposit = deposit;
        this.totalPay = totalPay;
    }

    public Contact() {
    }

    public String getIdContact() {
        return idContact;
    }

    public void setIdContact(String idContact) {
        this.idContact = idContact;
    }

    public Booking getIdBooking() {
        return idBooking;
    }

    public void setIdBooking(Booking idBooking) {
        this.idBooking = idBooking;
    }

    public long getDeposit() {
        return deposit;
    }

    public void setDeposit(long deposit) {
        this.deposit = deposit;
    }

    public long getTotalPay() {
        return totalPay;
    }

    public void setTotalPay(long totalPay) {
        this.totalPay = totalPay;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Contact)) return false;
        Contact contact = (Contact) o;
        return Objects.equals(getIdContact(), contact.getIdContact());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIdContact());
    }

    @Override
    public String toString() {
        return "Contact{" +
                "idContact='" + idContact + '\'' +
                ", idBooking=" + idBooking.getIdBooking() +
                ", deposit=" + deposit +
                ", totalPay=" + totalPay +
                '}';
    }
}
