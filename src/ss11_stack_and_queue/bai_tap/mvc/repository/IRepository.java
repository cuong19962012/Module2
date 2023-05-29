package ss11_stack_and_queue.bai_tap.mvc.repository;

import ss11_stack_and_queue.bai_tap.mvc.model.Person;

import java.util.ArrayList;
import java.util.List;

public interface IRepository {

    List<Person> getData();

    void addPerson(Person person);

    int searchPerson(int id);

    void deletePerson(int index);

}
