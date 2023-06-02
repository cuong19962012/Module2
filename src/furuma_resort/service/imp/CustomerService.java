package furuma_resort.service.imp;

import furuma_resort.model.person.Customer;
import furuma_resort.model.person.Person;
import furuma_resort.repository.imp.CustomerRepository;
import furuma_resort.service.ICustomerService;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomerService implements ICustomerService {
    private static CustomerRepository customerRepository = new CustomerRepository();
    private static Scanner scanner = new Scanner(System.in);

    @Override
    public void edit() {
        System.out.println("Enter you need edit id of customer");
        String id = scanner.nextLine();
        int index = customerRepository.check(id);
        if (index != -1) {
            createEditCustomer(index);
        } else {
            System.out.println("Can't find customer");
        }
    }

    private static void createEditCustomer(int index) {
        String idCustomer;
        do {
            System.out.println("Enter id ");
            idCustomer = scanner.nextLine();
            if (idCustomer.equals(""))
                break;
        } while (!idCustomer.matches("^NV-\\d{4}$"));
        String name;
        do {
            System.out.println("Enter name ");
            name = scanner.nextLine();
            if (name.equals(""))
                break;
        } while (!name.matches("^[A-Z][a-z]*( ([A-Z][a-z]*))*$"));
        String birthday;
        do {
            try {
                System.out.println("Enter birthday ");
                birthday = scanner.nextLine();
                if (birthday.equals(""))
                    break;
                int length = birthday.length();
                int year = Integer.parseInt("" + birthday.charAt(length - 4) + birthday.charAt(length - 3) + birthday.charAt(length - 2) + birthday.charAt(length - 1));
                int month = Integer.parseInt("" + birthday.charAt(3) + birthday.charAt(4));
                int day = Integer.parseInt("" + birthday.charAt(0) + birthday.charAt(1));
                LocalDate dateBefore = LocalDate.of(year, month, day);
                LocalDate dateAfter = LocalDate.now();
                if (birthday.matches("^\\d{2}-\\d{2}-\\d{4}$") && ChronoUnit.YEARS.between(dateBefore, dateAfter) >= 18)
                    break;
            } catch (NumberFormatException e) {
                System.out.println("Định dạng sai");
            } catch (Exception e) {
                System.out.println("Lỗi rồi");
            }
        } while (true);
        Boolean gender = null;
        do {
            System.out.println("Enter a gender");
            String strGender = scanner.nextLine();
            if (strGender.equals("True")) {
                gender = true;
                break;
            } else if (strGender.equals("False")) {
                gender = false;
                break;
            } else if (strGender.equals(""))
                break;
            else
                System.out.println("Wrong format");
        } while (true);
        String identityNumber;
        do {
            System.out.println("Enter identity number ");
            identityNumber = scanner.nextLine();
            if (identityNumber.equals(""))
                break;
        } while (!identityNumber.matches("^([0-9]{9}|[0-9]{12})$"));
        String phoneNumber;
        do {
            System.out.println("Enter phone number");
            phoneNumber = scanner.nextLine();
            if (phoneNumber.equals(""))
                break;
            if (phoneNumber.matches("^0\\d{9}$"))
                break;
        } while (true);
        String email;
        do {
            System.out.println("Enter email");
            email = scanner.nextLine();
            if (email.equals(""))
                break;
            if (email.matches("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$"))
                break;
        } while (true);
        System.out.println("Enter type customer");
        String typeCustomer = scanner.nextLine();
        System.out.println("Enter address");
        String address = scanner.nextLine();

        List<String> editCustomer = new ArrayList<>();
        //String id, String name, String birthday, boolean gender, String identityNumber, String phoneNumber,
        //        // String email, String literacy, String position, double salary
        editCustomer.add(idCustomer);
        editCustomer.add(name);
        editCustomer.add(birthday);
        editCustomer.add(String.valueOf(gender));
        editCustomer.add(identityNumber);
        editCustomer.add(phoneNumber);
        editCustomer.add(email);
        editCustomer.add(typeCustomer);
        editCustomer.add(address);
        customerRepository.edit(index, editCustomer);
    }

    @Override
    public void delete() {
        System.out.println("Enter you need delete id of customer");
        String id = scanner.nextLine();
        int index = customerRepository.check(id);
        if (index != -1) {
            System.out.println("Press 'Y' for delete ");
            System.out.println("Press any key for back menu");
            String mychoice = scanner.nextLine();
            if (mychoice.equals("Y"))
                customerRepository.delete(index);
        } else {
            System.out.println("Can't find customer");
        }
    }

    @Override
    public void search() {
        System.out.println("Enter name for search: ");
        String searchName = scanner.nextLine();
        Person customer = customerRepository.search(searchName);
        if (customer != null)
            System.out.println(customer);
        else
            System.out.println("Can't find customer");
    }

    @Override
    public void display() {
        List<Person> data = customerRepository.display();
        for (Person e : data) {
            System.out.println(e);
        }
    }

    @Override
    public void add() {
        Person person = createAddCustomer();
        if (customerRepository.add(person))
            System.out.println("Add success!");
        else
            System.out.println("Id duplicate!!!");
    }

    private static Person createAddCustomer() {
        String id;
        do {
            System.out.println("Enter id ");
            id = scanner.nextLine();
            if (id.matches("^KH-\\d{4}$"))
                break;
        } while (true);
        String name;
        do {
            System.out.println("Enter name ");
            name = scanner.nextLine();
            if (name.matches("^[A-Z][a-z]*( ([A-Z][a-z]*))*$"))
                break;
        } while (true);
        String birthday;
        do {
            try {
                System.out.println("Enter birthday ");
                birthday = scanner.nextLine();
                int length = birthday.length();
                int year = Integer.parseInt("" + birthday.charAt(length - 4) + birthday.charAt(length - 3) + birthday.charAt(length - 2) + birthday.charAt(length - 1));
                int month = Integer.parseInt("" + birthday.charAt(3) + birthday.charAt(4));
                int day = Integer.parseInt("" + birthday.charAt(0) + birthday.charAt(1));
                LocalDate dateBefore = LocalDate.of(year, month, day);
                LocalDate dateAfter = LocalDate.now();
                if (birthday.matches("^\\d{2}-\\d{2}-\\d{4}$") && ChronoUnit.YEARS.between(dateBefore, dateAfter) >= 18)
                    break;
            } catch (NumberFormatException e) {
                System.out.println("Wrong format");
            } catch (Exception e) {
                System.out.println("Don't know exception");
            }
        } while (true);
        boolean gender;
        do {
            System.out.println("Enter a gender");
            String strGender = scanner.nextLine();
            if (strGender.equals("True")) {
                gender = true;
                break;
            } else if (strGender.equals("False")) {
                gender = false;
                break;
            } else
                System.out.println("Wrong format");
        } while (true);
        String identityNumber;
        do {
            System.out.println("Enter identity number ");
            identityNumber = scanner.nextLine();
        } while (!identityNumber.matches("^([0-9]{9}|[0-9]{12})$"));
        String phoneNumber;
        do {
            System.out.println("Enter phone number");
            phoneNumber = scanner.nextLine();
            if (phoneNumber.matches("^0\\d{9}$"))
                break;
        } while (true);
        String email;
        do {
            System.out.println("Enter email");
            email = scanner.nextLine();
        } while (!email.matches("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$"));
        String typeCustomer;
        do {
            System.out.println("Enter typeCustomer");
            typeCustomer = scanner.nextLine();
            //Diamond, Platinum, Gold, Silver, Member
            if (typeCustomer.equals("Diamond") || typeCustomer.equals("Platinum") || typeCustomer.equals("Gold") || typeCustomer.equals("Silver") || typeCustomer.equals("Member"))
                break;
        } while (true);
        System.out.println("Enter address");
        String address = scanner.nextLine();
        // String id, String name, String birthday, boolean gender, String identityNumber, String phoneNumber, String email, String typeCustomer, String address
        Person person = new Customer(id, name, birthday, gender, identityNumber, phoneNumber, email, typeCustomer, address);
        return person;
    }
}
