package ss11_stack_and_queue.bai_tap.mvc.repository.imp;

import ss11_stack_and_queue.bai_tap.mvc.common.PersonCommon;
import ss11_stack_and_queue.bai_tap.mvc.model.Person;
import ss11_stack_and_queue.bai_tap.mvc.repository.IRepository;

import java.util.Iterator;
import java.util.List;

public class PersonRepository implements IRepository {
    private static PersonCommon personCommon = new PersonCommon();

    @Override
    public List<Person> getData() {
        return personCommon.readFile();
    }

    @Override
    public void addPerson(Person person) {
        List<Person> list = personCommon.readFile();
        list.add(person);
        personCommon.writeFile(list);
    }

    @Override
    public int searchPerson(int id) {
        List<Person> list = personCommon.readFile();
        Iterator<Person> iterator = list.iterator();
        while (iterator.hasNext()) {
            Person person = iterator.next();
            if (person.getId() == id) {
                return list.indexOf(person);
            }
        }
        return -1;
    }

    @Override
    public void deletePerson(int index) {
        List<Person> list = personCommon.readFile();
        list.remove(index);
        personCommon.writeFile(list);
    }

}
