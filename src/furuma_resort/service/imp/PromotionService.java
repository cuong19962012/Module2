package furuma_resort.service.imp;

import furuma_resort.model.person.Customer;
import furuma_resort.repository.imp.PromotionRepository;
import furuma_resort.service.IPromotionService;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class PromotionService implements IPromotionService {
    private static Scanner scanner = new Scanner(System.in);
    private static PromotionRepository promotionRepository = new PromotionRepository();

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
        int voucher10;
        do {
            System.out.println("Enter quantity of voucher 10% ");
            try {
                voucher10 = Integer.parseInt(scanner.nextLine());
                if (voucher10 >= 0)
                    break;
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
                if (voucher20 >= 0)
                    break;
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
                if (voucher50 >= 0)
                    break;
            } catch (NumberFormatException e) {
                System.out.println("Wrong format");
            } catch (Exception e) {
                System.out.println("Exception");
            }
        } while (true);
        HashMap<Customer, String> dataCustomerGetVoucher = promotionRepository.getCustomerWhoGetVoucher(voucher10, voucher20, voucher50);
    }
}
