package furuma_resort.repository;

import furuma_resort.model.person.Customer;

import java.util.HashMap;
import java.util.Set;
import java.util.TreeMap;

public interface IPromotionRepository {

    Set<Customer> getCustomerUseService(int year);

    HashMap<Customer, String> getCustomerWhoGetVoucher(int voucher10, int voucher20, int voucher50);
}
