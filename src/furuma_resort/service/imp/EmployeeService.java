package furuma_resort.service.imp;

import furuma_resort.model.person.Employee;
import furuma_resort.model.person.Person;
import furuma_resort.repository.imp.EmployeeRepository;
import furuma_resort.service.IEmployeeService;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeService implements IEmployeeService {
    private static EmployeeRepository employeeRepository = new EmployeeRepository();
    private static Scanner scanner = new Scanner(System.in);

    @Override
    public void edit() {
        System.out.println("Enter you need edit id of Employee");
        String id = scanner.nextLine();
        int index = employeeRepository.check(id);
        if (index != -1) {
            createEditEmployee(index);
        } else {
            System.out.println("Can't find employee");
        }
    }

    private static void createEditEmployee(int index) {
        String idEmployee;
        do {
            System.out.println("Enter id employee ");
            idEmployee = scanner.nextLine();
            if (idEmployee.equals(""))
                break;
        } while (!idEmployee.matches("^NV-\\d{4}$"));
        String name;
        do {
            System.out.println("Enter name employee ");
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
                System.out.println("Wrong format");
            } catch (Exception e) {
                System.out.println("Exception");
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
        String literacy;
        do {
            System.out.println("Enter literacy");
            literacy = scanner.nextLine();
            if (literacy.equals(""))
                break;
            if(literacy.equals("Vocational")||literacy.equals("College")||literacy.equals("University")||literacy.equals("Postgraduate"))
                break;
        }while (true);
        String position;
        do {
            System.out.println("Enter position");
            position = scanner.nextLine();
            if(position.equals(""))
                break;
            if(position.equals("Receptionist")||position.equals("Waiter")||position.equals("Expert")||position.equals("Supervisor")||position.equals("Manager")||position.equals("Director"))
                break;
        }while (true);
        Double salary=null;
        do {
            System.out.println("Enter salary");
            String strSalary = scanner.nextLine();
            if (strSalary.equals(""))
                break;
            try {
                salary = Double.parseDouble(strSalary);
            } catch (NumberFormatException e) {
                System.out.println("Wrong Format");
            }
            if (salary > 0)
                break;
        } while (true);
        List<String> editEmployee = new ArrayList<>();
        //String id, String name, String birthday, boolean gender, String identityNumber, String phoneNumber,
        //        // String email, String literacy, String position, double salary
        editEmployee.add(idEmployee);
        editEmployee.add(name);
        editEmployee.add(birthday);
        editEmployee.add(String.valueOf(gender));
        editEmployee.add(identityNumber);
        editEmployee.add(phoneNumber);
        editEmployee.add(email);
        editEmployee.add(literacy);
        editEmployee.add(position);
        editEmployee.add(String.valueOf(salary));
        employeeRepository.edit(index, editEmployee);
    }

    @Override
    public void delete() {
        System.out.println("Enter you need delete id of Employee");
        String id = scanner.nextLine();
        int index = employeeRepository.check(id);
        if (index != -1) {
            System.out.println("Press 'Y' for delete ");
            System.out.println("Press any key for back menu");
            String mychoice = scanner.nextLine();
            if (mychoice.equals("Y"))
                employeeRepository.delete(index);
        } else {
            System.out.println("Can't find employee");
        }
    }

    @Override
    public void search() {
        System.out.println("Enter name for search: ");
        String searchName = scanner.nextLine();
        Person employee = employeeRepository.search(searchName);
        if (employee != null)
            System.out.println(employee);
        else
            System.out.println("Can't find employee");
    }

    @Override
    public void display() {
        List<Person> data = employeeRepository.display();
        for (Person e : data) {
            System.out.println(e);
        }
    }

    @Override
    public void add() {
        //String id, String name, String birthday, boolean gender, String identityNumber, String phoneNumber,
        // String email, String literacy, String position, double salary
        Person person = createAddEmployee();
        if (employeeRepository.add(person))
            System.out.println("Add success!");
        else
            System.out.println("Id duplicate!!!");
    }

    private static Person createAddEmployee() {
        String id;
        do {
            System.out.println("Enter id employee ");
            id = scanner.nextLine();
            if (id.matches("^NV-\\d{4}$"))
                break;
        } while (true);
        String name;
        do {
            System.out.println("Enter name employee ");
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
                System.out.println("Định dạng sai");
            } catch (Exception e) {
                System.out.println("Lỗi rồi");
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
        String literacy;
        do {
            System.out.println("Enter literacy");
            literacy = scanner.nextLine();
            if(literacy.equals("Vocational")||literacy.equals("College")||literacy.equals("University")||literacy.equals("Postgraduate"))
                break;
        }while (true);
        String position;
        do {
            System.out.println("Enter position");
            position = scanner.nextLine();
            if(position.equals("Receptionist")||position.equals("Waiter")||position.equals("Expert")||position.equals("Supervisor")||position.equals("Manager")||position.equals("Director"))
                break;
        }while (true);
        double salary;
        do {
            System.out.println("Enter salary");
            salary = Double.parseDouble(scanner.nextLine());
            if (salary > 0)
                break;
        } while (true);
        ////String id, String name, String birthday, boolean gender, String identityNumber, String phoneNumber,
        //        // String email, String literacy, String position, double salary
        Person person = new Employee(id, name, birthday, gender, identityNumber, phoneNumber, email, position, position, salary);
        return person;
    }
}
