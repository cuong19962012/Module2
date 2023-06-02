package furuma_resort.repository.imp;

import furuma_resort.model.person.Employee;
import furuma_resort.model.person.Person;
import furuma_resort.repository.IEmployeeRepository;
import furuma_resort.utils.employee_file.ReadFileEmployee;
import furuma_resort.utils.employee_file.WriteFileEmployee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository implements IEmployeeRepository {
    private static final String PATH_EMPLOYEE = "src/furuma_resort/utils/employee_file/employee.csv";
    //    private static List<String> temp = new ArrayList<>();
    private static List<Person> data = new ArrayList<>();
    private static final String COMMA = ",";

//    static {
//        Employee employee = new Employee("E-001", "Hoàng", "17-05-1996", true, "999999999", "012345678", "hoangnguyen@gmail.com", "College", "FontStaff", 1000000);
//        String employee1 = employee.getId() + COMMA + employee.getName() + COMMA + employee.getBirthday() + COMMA + employee.isGender() + COMMA + employee.getIdentityNumber() + COMMA + employee.getPhoneNumber() + COMMA + employee.getEmail() + COMMA + employee.getLiteracy() + COMMA + employee.getPosition() + COMMA + employee.getSalary();
//        temp.add(employee1);
//        WriteFileEmployee.writeFile(temp, "src/furuma_resort/utils/employee_file/employee.csv", true);
//    }


    @Override
    public int check(String id) {
        List<Person> list = display();
        for (Person e : list) {
            if (e.getId().equals(id))
                return list.indexOf(e);
        }
        return -1;
    }

    @Override
    public void edit(int index, List<String> editInfo) {
        List<Person> list = display();
        Person employee = list.get(index);
        if (!editInfo.get(0).equals(""))
            employee.setId(editInfo.get(0));
        if (!editInfo.get(1).equals(""))
            employee.setName(editInfo.get(1));
        if (!editInfo.get(2).equals(""))
            employee.setBirthday(editInfo.get(2));
        if (!editInfo.get(3).equals("null"))
            employee.setGender(Boolean.parseBoolean(editInfo.get(3)));
        if (!editInfo.get(4).equals(""))
            employee.setIdentityNumber(editInfo.get(4));
        if (!editInfo.get(5).equals(""))
            employee.setPhoneNumber(editInfo.get(5));
        if (!editInfo.get(6).equals(""))
            employee.setEmail(editInfo.get(6));
        if (!editInfo.get(7).equals(""))
            ((Employee) employee).setLiteracy(editInfo.get(7));
        if (!editInfo.get(8).equals(""))
            ((Employee) employee).setPosition(editInfo.get(8));
        if (!editInfo.get(9).equals("null"))
            ((Employee) employee).setSalary(Double.parseDouble(editInfo.get(9)));
        List<String> strEmployee = new ArrayList<>();
        for (Person e : list) {
            String str = e.getId() + COMMA + e.getName() + COMMA + e.getBirthday() + COMMA + e.isGender() + COMMA + e.getIdentityNumber() + COMMA + e.getPhoneNumber() + COMMA + e.getEmail() + COMMA + ((Employee) e).getLiteracy() + COMMA + ((Employee) e).getPosition() + COMMA + String.format("%.2f", ((Employee) e).getSalary());
            strEmployee.add(str);
        }
        WriteFileEmployee.writeFile(strEmployee, PATH_EMPLOYEE, false);
    }

    @Override
    public void delete(int index) {
        List<Person> list = display();
        list.remove(index);
        List<String> strEmployee = new ArrayList<>();
        for (Person e : list) {
            String str = e.getId() + COMMA + e.getName() + COMMA + e.getBirthday() + COMMA + e.isGender() + COMMA + e.getIdentityNumber() + COMMA + e.getPhoneNumber() + COMMA + e.getEmail() + COMMA + ((Employee) e).getLiteracy() + COMMA + ((Employee) e).getPosition() + COMMA + String.format("%.2f", ((Employee) e).getSalary());
            strEmployee.add(str);
        }
        WriteFileEmployee.writeFile(strEmployee, PATH_EMPLOYEE, false);
    }

    @Override
    public Person search(String searchName) {
        List<Person> list = display();
        for (Person e : list) {
            if(e.getName().equals(searchName))
                return e;
        }
        return null;
    }

    @Override
    public List<Person> display() {
        data.clear();
        List<String> employees = ReadFileEmployee.readFile(PATH_EMPLOYEE);
        for (String e : employees) {
            String[] arr = e.split(",");
            //String id, String name, String birthday, boolean gender, String identityNumber, String phoneNumber, String email, String literacy, String position, double salary
            data.add(new Employee(arr[0], arr[1], arr[2], Boolean.parseBoolean(arr[3]), arr[4], arr[5], arr[6], arr[7], arr[8], Double.parseDouble(arr[9])));
        }
        return data;
    }


    @Override
    public boolean add(Person employee) {
        if (check(employee.getId()) == -1) {
            List<String> str = new ArrayList<>();
            String strEmployee = employee.getId() + COMMA + employee.getName() + COMMA + employee.getBirthday() + COMMA + employee.isGender() + COMMA + employee.getIdentityNumber() + COMMA + employee.getPhoneNumber() + COMMA + employee.getEmail() + COMMA + ((Employee) employee).getLiteracy() + COMMA + ((Employee) employee).getPosition() + COMMA + String.format("%.2f", ((Employee) employee).getSalary());
            str.add(strEmployee);
            WriteFileEmployee.writeFile(str, PATH_EMPLOYEE, true);
            return true;
        } else
            return false;
    }
}
