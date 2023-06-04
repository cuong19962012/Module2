package furuma_resort.utils.comparator;

import furuma_resort.model.person.Customer;

import java.util.Comparator;

public class ComparatorCustomer implements Comparator<Customer> {
    @Override
    public int compare(Customer o1, Customer o2) {
        return o1.getId().compareTo(o2.getId());
    }
}
