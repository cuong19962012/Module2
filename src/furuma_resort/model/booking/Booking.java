package furuma_resort.model.booking;

import furuma_resort.model.facility.Facility;
import furuma_resort.model.person.Customer;

import java.util.Objects;

public class Booking implements Comparable<Booking> {
    private String idBooking;
    private String dateBooking;
    private String dateStart;
    private String dateEnd;
    private Customer idCustomer;
    private Facility idFacility;

    public Booking() {
    }

    public Booking(String idBooking, String dateBooking, String dateStart, String dateEnd, Customer idCustomer, Facility idFacility) {
        this.idBooking = idBooking;
        this.dateBooking = dateBooking;
        this.dateStart = dateStart;
        this.dateEnd = dateEnd;
        this.idCustomer = idCustomer;
        this.idFacility = idFacility;
    }

    public String getIdBooking() {
        return idBooking;
    }

    public void setIdBooking(String idBooking) {
        this.idBooking = idBooking;
    }

    public String getDateBooking() {
        return dateBooking;
    }

    public void setDateBooking(String dateBooking) {
        this.dateBooking = dateBooking;
    }

    public String getDateStart() {
        return dateStart;
    }

    public void setDateStart(String dateStart) {
        this.dateStart = dateStart;
    }

    public String getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(String dateEnd) {
        this.dateEnd = dateEnd;
    }

    public Customer getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(Customer idCustomer) {
        this.idCustomer = idCustomer;
    }

    public Facility getIdFacility() {
        return idFacility;
    }

    public void setIdFacility(Facility idFacility) {
        this.idFacility = idFacility;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "idBooking='" + idBooking + '\'' +
                ", dateBooking='" + dateBooking + '\'' +
                ", dateStart='" + dateStart + '\'' +
                ", dateEnd='" + dateEnd + '\'' +
                ", idCustomer='" + idCustomer.getId() + '\'' +
                ", idService='" + idFacility.getIdFacility() + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Booking)) return false;
        Booking booking = (Booking) o;
        return Objects.equals(getIdBooking(), booking.getIdBooking());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIdBooking());
    }


    @Override
    public int compareTo(Booking o) {
        if (this.getDateStart().equals(o.getDateStart()))
            return this.getDateEnd().compareTo(o.getDateEnd());
        else
            return this.getDateStart().compareTo(o.getDateStart());
    }
}
