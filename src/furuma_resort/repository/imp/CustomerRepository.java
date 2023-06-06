package furuma_resort.repository.imp;

import furuma_resort.model.person.Customer;
import furuma_resort.model.person.Person;
import furuma_resort.repository.ICustomerRepository;
import furuma_resort.utils.customer_file.ReadFileCustomer;
import furuma_resort.utils.customer_file.WriteFileCustomer;

import java.util.ArrayList;
import java.util.List;

public class CustomerRepository implements ICustomerRepository {
    private static final String PATH_CUSTOMER = "src/furuma_resort/utils/customer_file/customer.csv";
    private static final List<Person> data = new ArrayList<>();
    private static final String COMMA = ",";

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
        Person customer = list.get(index);
        if (!editInfo.get(0).equals(""))
            customer.setId(editInfo.get(0));
        if (!editInfo.get(1).equals(""))
            customer.setName(editInfo.get(1));
        if (!editInfo.get(2).equals(""))
            customer.setBirthday(editInfo.get(2));
        if (!editInfo.get(3).equals("null"))
            customer.setGender(Boolean.parseBoolean(editInfo.get(3)));
        if (!editInfo.get(4).equals(""))
            customer.setIdentityNumber(editInfo.get(4));
        if (!editInfo.get(5).equals(""))
            customer.setPhoneNumber(editInfo.get(5));
        if (!editInfo.get(6).equals(""))
            customer.setEmail(editInfo.get(6));
        if (!editInfo.get(7).equals(""))
            ((Customer) customer).setTypeCustomer(editInfo.get(7));
        if (!editInfo.get(8).equals(""))
            ((Customer) customer).setAddress(editInfo.get(8));
        List<String> strCustomer = new ArrayList<>();
        for (Person c : list) {
            String str = c.getId() + COMMA + c.getName() + COMMA + c.getBirthday() + COMMA + c.isGender() + COMMA + c.getIdentityNumber() + COMMA + c.getPhoneNumber() + COMMA + c.getEmail() + COMMA + ((Customer) c).getTypeCustomer() + COMMA + ((Customer) c).getAddress();
            strCustomer.add(str);
        }
        WriteFileCustomer.writeFile(strCustomer, PATH_CUSTOMER, false);
    }

    @Override
    public void delete(int index) {
        List<Person> list = display();
        list.remove(index);
        List<String> strCustomer = new ArrayList<>();
        for (Person c : list) {
            String str = c.getId() + COMMA + c.getName() + COMMA + c.getBirthday() + COMMA + c.isGender() + COMMA + c.getIdentityNumber() + COMMA + c.getPhoneNumber() + COMMA + c.getEmail() + COMMA + ((Customer) c).getTypeCustomer() + COMMA + ((Customer) c).getAddress();
            strCustomer.add(str);
        }
        WriteFileCustomer.writeFile(strCustomer, PATH_CUSTOMER, false);
    }

    @Override
    public Person search(String searchName) {
        List<Person> list = display();
        for (Person e : list) {
            if (e.getName().equals(searchName))
                return e;
        }
        return null;
    }

    @Override
    public List<Person> display() {
        data.clear();
        List<String> customers = ReadFileCustomer.readFile(PATH_CUSTOMER);
        for (String e : customers) {
            String[] arr = e.split(",");
            //String id, String name, String birthday, boolean gender, String identityNumber, String phoneNumber, String email, String literacy, String position, double salary
            data.add(new Customer(arr[0], arr[1], arr[2], Boolean.parseBoolean(arr[3]), arr[4], arr[5], arr[6], arr[7], arr[8]));
        }
        return data;
    }

    @Override
    public boolean add(Person customer) {
        //String id, String name, String birthday, boolean gender, String identityNumber, String phoneNumber, String email, String typeCustomer, String address
        if (check(customer.getId()) == -1) {
            List<String> str = new ArrayList<>();
            String strCustomer = customer.getId() + COMMA + customer.getName() + COMMA + customer.getBirthday() + COMMA + customer.isGender() + COMMA + customer.getIdentityNumber() + COMMA + customer.getPhoneNumber() + COMMA + customer.getEmail() + COMMA + ((Customer) customer).getTypeCustomer() + COMMA + ((Customer) customer).getAddress();
            str.add(strCustomer);
            WriteFileCustomer.writeFile(str, PATH_CUSTOMER, true);
            return true;
        } else
            return false;
    }
}
