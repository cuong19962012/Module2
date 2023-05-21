package ss11_stack_and_queue.mvc.repository;

import ss11_stack_and_queue.mvc.model.Person;

import java.util.ArrayList;

public interface IRepository {

    ArrayList<Person> getData();

    void addPerson(Person person);

    int searchPerson(int id);

    void deletePerson(int index);
}
