package furuma_resort.repository;

import furuma_resort.model.person.Employee;
import furuma_resort.model.person.Person;

import java.util.List;

public interface IRepository<E> {
    List<E> display();

    void add(Person employee);

}
