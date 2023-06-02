package furuma_resort.repository;

import furuma_resort.model.person.Person;

import java.util.List;

public interface ICustomerRepository extends IRepository<Person> {
    int check(String id);

    void edit(int index, List<String> editInfo);

    void delete(int index);

    Person search(String searchName);

}
