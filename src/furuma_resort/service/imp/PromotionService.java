package furuma_resort.service.imp;

import furuma_resort.model.booking.Booking;
import furuma_resort.model.person.Customer;
import furuma_resort.repository.IPromotionRepository;
import furuma_resort.repository.imp.PromotionRepository;
import furuma_resort.service.IPromotionService;

import java.time.LocalDate;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;

public class PromotionService implements IPromotionService {
    private static final String VOUCHER_10 = " Voucher 10%";
    private static final String VOUCHER_20 = " Voucher 20%";
    private static final String VOUCHER_50 = " Voucher 50%";
    private static Scanner scanner = new Scanner(System.in);
    private static IPromotionRepository promotionRepository = new PromotionRepository();

    @Override
    public void displayCustomerUseService() {
        int year;
        do {
            System.out.println("Enter filter by year ");
            try {
                year = Integer.parseInt(scanner.nextLine());
                if (year > 2010 && year <= LocalDate.now().getYear())
                    break;
            } catch (NumberFormatException e) {
                System.out.println("Wrong format");
            } catch (Exception e) {
                System.out.println("Exception");
            }
        } while (true);
        Set<Customer> dataCustomerUseService = promotionRepository.getCustomerUseService(year);
        for (Customer c : dataCustomerUseService) {
            System.out.println(c);
        }
    }

    @Override
    public void displayCustomerGetVoucher() {
        int bookingQuantity = promotionRepository.checkBooking();
        int voucher10;
        do {
            System.out.println("Enter quantity of voucher 10% ");
            try {
                voucher10 = Integer.parseInt(scanner.nextLine());
                if (voucher10 >= 0 && voucher10 <= bookingQuantity)
                    break;
                System.out.println("Over quantity left or wrong input");
            } catch (NumberFormatException e) {
                System.out.println("Wrong format");
            } catch (Exception e) {
                System.out.println("Exception");
            }
        } while (true);
        int voucher20;
        do {
            System.out.println("Enter quantity of voucher 20% ");
            try {
                voucher20 = Integer.parseInt(scanner.nextLine());
                if (voucher20 >= 0 && voucher20 <= bookingQuantity - voucher10)
                    break;
                System.out.println("Over quantity left or wrong input");
            } catch (NumberFormatException e) {
                System.out.println("Wrong format");
            } catch (Exception e) {
                System.out.println("Exception");
            }
        } while (true);
        int voucher50;
        do {
            System.out.println("Enter quantity of voucher 50% ");
            try {
                voucher50 = Integer.parseInt(scanner.nextLine());
                if (voucher50 >= 0 && voucher50 <= bookingQuantity - voucher10 - voucher20)
                    break;
                System.out.println("Over quantity left or wrong input");
            } catch (NumberFormatException e) {
                System.out.println("Wrong format");
            } catch (Exception e) {
                System.out.println("Exception");
            }
        } while (true);
        Stack<Booking> stack = promotionRepository.getBooking();
        for (Booking b : stack) {
            if (voucher10 > 0) {
                System.out.println(b.getIdCustomer().getId() + " " + b.getIdCustomer().getName() + " " + VOUCHER_10);
                voucher10--;
            } else if (voucher20 > 0) {
                System.out.println(b.getIdCustomer().getId() + " " + b.getIdCustomer().getName() + " " + VOUCHER_20);
                voucher20--;
            } else if (voucher50 > 0) {
                System.out.println(b.getIdCustomer().getId() + " " + b.getIdCustomer().getName() + " " + VOUCHER_50);
                voucher50--;
            }
        }
    }
}
