package furuma_resort.service.imp;

import furuma_resort.model.booking.Booking;
import furuma_resort.model.contact.Contact;
import furuma_resort.repository.imp.ContactRepository;
import furuma_resort.service.IContactService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ContactService implements IContactService {
    private static Scanner scanner = new Scanner(System.in);
    private static ContactRepository contactRepository = new ContactRepository();

    @Override
    public void edit() {
        System.out.println("Enter id contact for edit");
        String id = scanner.nextLine();
        int index = contactRepository.check(id);
        if (index != -1) {
            Contact editContact = contactRepository.getEditContact(index);
            List<String> arrInfo = createArrInfoEditContact(editContact);
            try {
                contactRepository.edit(arrInfo, index);
            } catch (NumberFormatException e) {
                System.out.println(e.getStackTrace());
            }
        } else
            System.out.println("Can't find contact");
    }

    private static List<String> createArrInfoEditContact(Contact editContact) {
        String idContact;
        do {
            System.out.println("Enter id contact");
            idContact = scanner.nextLine();
            if (idContact.matches("^HD-[0-9]{4}$") || idContact.equals(""))
                break;
        } while (true);
        Booking idBooking = contactRepository.getDataBooking().poll();
        System.out.println("Id booking : " + idBooking.getIdBooking());
        Long deposit = null;
        do {
            String strDeposit = "";
            System.out.println("Enter deposit");
            try {
                strDeposit = scanner.nextLine();
                if (strDeposit.equals(""))
                    break;
                deposit = Long.parseLong(strDeposit);
                if (deposit > 0 && deposit <= Long.MAX_VALUE)
                    break;
            } catch (NumberFormatException e) {
                System.out.println("Wrong format");
            } catch (Exception e) {
                System.out.println("Exception");
            }
        } while (true);
        Long totalPay = null;
        do {
            String strTotalPay = "";
            System.out.println("Enter total pay");
            try {
                strTotalPay = scanner.nextLine();
                if (strTotalPay.equals(""))
                    break;
                totalPay = Long.parseLong(strTotalPay);
                if (totalPay > editContact.getDeposit() && totalPay <= Long.MAX_VALUE)
                    break;
            } catch (NumberFormatException e) {
                System.out.println("Wrong format");
            } catch (Exception e) {
                System.out.println("Exception");
            }
        } while (true);
        List<String> arrInfo = new ArrayList<>();
        arrInfo.add(idContact);
        arrInfo.add(String.valueOf(deposit));
        arrInfo.add(String.valueOf(totalPay));
        return arrInfo;
    }

    @Override
    public void display() {
        List<Contact> data = contactRepository.getData();
        for (Contact c : data) {
            System.out.println(c);
        }
    }

    @Override
    public void add() {
        System.out.println("List booking: ");
        for (Booking b : contactRepository.getDataBooking()) {
            System.out.println(b);
        }
        //String idContact, Booking idBooking, long deposit, long totalPay
        createAddContact();
    }

    private static void createAddContact() {
        String idContact;
        do {
            System.out.println("Enter id contact");
            idContact = scanner.nextLine();
            if (idContact.matches("^HD-[0-9]{4}$"))
                break;
        } while (true);
        Booking idBooking = contactRepository.getDataBooking().poll();
        System.out.println("Id booking : " + idBooking.getIdBooking());
        long deposit;
        do {
            System.out.println("Enter deposit");
            try {
                deposit = Long.parseLong(scanner.nextLine());
                if (deposit > 0 && deposit <= Long.MAX_VALUE)
                    break;
            } catch (NumberFormatException e) {
                System.out.println("Wrong format");
            } catch (Exception e) {
                System.out.println("Exception");
            }
        } while (true);
        long totalPay;
        do {
            System.out.println("Enter total pay");
            try {
                totalPay = Long.parseLong(scanner.nextLine());
                if (totalPay > deposit && totalPay <= Long.MAX_VALUE)
                    break;
            } catch (NumberFormatException e) {
                System.out.println("Wrong format");
            } catch (Exception e) {
                System.out.println("Exception");
            }
        } while (true);
        if (contactRepository.check(idContact) == -1)
            contactRepository.add(new Contact(idContact, idBooking, deposit, totalPay));
        else
            System.out.println("duplicate");
    }
}
