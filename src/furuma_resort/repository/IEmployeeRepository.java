package furuma_resort.repository;

import furuma_resort.model.person.Employee;
import furuma_resort.model.person.Person;

public interface IEmployeeRepository extends IRepository {


    int check(String id);

    void edit(int index);
    void delete(int index);
}
