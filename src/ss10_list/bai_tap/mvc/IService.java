package ss10_list.bai_tap.mvc;

public interface IService {
    Person[] displayList();
    boolean addPerson(Person p);
    void deletePerson(int id);
}
