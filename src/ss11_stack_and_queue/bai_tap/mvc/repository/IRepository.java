package ss11_stack_and_queue.bai_tap.mvc.repository;

import ss11_stack_and_queue.bai_tap.mvc.model.Person;

import java.util.ArrayList;

public interface IRepository {

    ArrayList<Person> getData();

    void addPerson(Person person);

    int searchPerson(int id);

    void deletePerson(int index);

    void writeData();
}
