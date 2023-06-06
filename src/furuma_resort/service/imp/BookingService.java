package furuma_resort.service.imp;

import furuma_resort.model.booking.Booking;
import furuma_resort.model.facility.Facility;
import furuma_resort.model.person.Customer;
import furuma_resort.model.person.Person;
import furuma_resort.repository.IBookingRepository;
import furuma_resort.repository.ICustomerRepository;
import furuma_resort.repository.IFacilityRepository;
import furuma_resort.repository.imp.BookingRepository;
import furuma_resort.repository.imp.CustomerRepository;
import furuma_resort.repository.imp.FacilityRepository;
import furuma_resort.service.IBookingService;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;
import java.util.Set;

public class BookingService implements IBookingService {
    private static Scanner scanner = new Scanner(System.in);
    private final IBookingRepository bookingRepository = new BookingRepository();
    private final ICustomerRepository customerRepository = new CustomerRepository();
    private final IFacilityRepository facilityRepository = new FacilityRepository();

    @Override
    public void display() {
        Set<Booking> data = bookingRepository.getData();
        for (Booking b : data) {
            System.out.println(b);
        }
    }

    @Override
    public void add() {
        System.out.println("Customer list: ");
        for (Person c : customerRepository.display()) {
            System.out.println(c);
        }
        System.out.println("Facility list: ");
        for (Facility f : facilityRepository.getData().keySet()) {
            if(facilityRepository.getData().get(f)<5)
                System.out.println(f);
        }
        //String idBooking, String dateBooking, String dateStart,
        // String dateEnd, Customer idCustomer, Facility idFacility
        String idBooking;
        do {
            System.out.println("Enter id booking ");
            idBooking = scanner.nextLine();
            if (idBooking.matches("^BK-[0-9]{4}$") && !bookingRepository.check(idBooking))
                break;
            System.out.println("Wrong format or duplicate");
        } while (true);
        String dateBooking;
        do {
            try {
                System.out.println("Enter date booking ");
                dateBooking = scanner.nextLine();
                int length = dateBooking.length();
                int year = Integer.parseInt("" + dateBooking.charAt(length - 4) + dateBooking.charAt(length - 3) + dateBooking.charAt(length - 2) + dateBooking.charAt(length - 1));
                int month = Integer.parseInt("" + dateBooking.charAt(3) + dateBooking.charAt(4));
                int day = Integer.parseInt("" + dateBooking.charAt(0) + dateBooking.charAt(1));
                LocalDate booking = LocalDate.of(year, month, day);
                LocalDate now = LocalDate.now();
                if (dateBooking.matches("^\\d{2}-\\d{2}-\\d{4}$") && ChronoUnit.DAYS.between(now, booking) >= 0)
                    break;
            } catch (NumberFormatException e) {
                System.out.println("Wrong format");
            } catch (Exception e) {
                System.out.println("Exception");
            }
        } while (true);
        //String idBooking, String dateBooking, String dateStart,
        // String dateEnd, Customer idCustomer, Facility idFacility
        String dateStart;
        do {
            try {
                System.out.println("Enter date start ");
                dateStart = scanner.nextLine();
                int length = dateStart.length();
                int year = Integer.parseInt("" + dateStart.charAt(length - 4) + dateStart.charAt(length - 3) + dateStart.charAt(length - 2) + dateStart.charAt(length - 1));
                int month = Integer.parseInt("" + dateStart.charAt(3) + dateStart.charAt(4));
                int day = Integer.parseInt("" + dateStart.charAt(0) + dateStart.charAt(1));
                LocalDate booking = LocalDate.of(year, month, day);
                LocalDate now = LocalDate.now();
                if (dateStart.matches("^\\d{2}-\\d{2}-\\d{4}$") && ChronoUnit.DAYS.between(now, booking) >= 0)
                    break;
            } catch (NumberFormatException e) {
                System.out.println("Wrong format");
            } catch (Exception e) {
                System.out.println("Exception");
            }
        } while (true);
        String dateEnd;
        do {
            try {
                System.out.println("Enter date end ");
                dateEnd = scanner.nextLine();
                int length = dateEnd.length();
                int year = Integer.parseInt("" + dateEnd.charAt(length - 4) + dateEnd.charAt(length - 3) + dateEnd.charAt(length - 2) + dateEnd.charAt(length - 1));
                int month = Integer.parseInt("" + dateEnd.charAt(3) + dateEnd.charAt(4));
                int day = Integer.parseInt("" + dateEnd.charAt(0) + dateEnd.charAt(1));
                LocalDate booking = LocalDate.of(year, month, day);
                LocalDate now = LocalDate.now();
                if (dateEnd.matches("^\\d{2}-\\d{2}-\\d{4}$") && ChronoUnit.DAYS.between(now, booking) > 0)
                    break;
            } catch (NumberFormatException e) {
                System.out.println("Wrong format");
            } catch (Exception e) {
                System.out.println("Exception");
            }
        } while (true);
        //String idBooking, String dateBooking, String dateStart,
        // String dateEnd, Customer idCustomer, Facility idFacility
        String idCustomer;
        Customer objectCustomer;
        DO_WHILE1:
        do {
            System.out.println("Enter id customer");
            idCustomer = scanner.nextLine();
            for (Person c : customerRepository.display()) {
                if (c.getId().equals(idCustomer)) {
                    objectCustomer = (Customer) c;
                    break DO_WHILE1;
                }
            }
            System.out.println("Can't find id");
        } while (true);
        String idFacility;
        Facility objectFacility;
        DO_WHILE2:
        do {
            System.out.println("Enter id facility");
            idFacility = scanner.nextLine();
            for (Facility f : facilityRepository.getData().keySet()) {
                if (f.getIdFacility().equals(idFacility) && facilityRepository.getData().get(f) < 5) {
                    objectFacility = f;
                    break DO_WHILE2;
                }
            }
            System.out.println("Can't find id");
        } while (true);
        //String idBooking, String dateBooking, String dateStart,
        // String dateEnd, Customer idCustomer, Facility idFacility
        bookingRepository.add(new Booking(idBooking, dateBooking, dateStart, dateEnd, objectCustomer, objectFacility));
    }
}
