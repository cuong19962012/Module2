package ss10_list.bai_tap.mvc;

import java.util.ArrayList;

public interface IRepository {
    ArrayList<Person> getData();
    ArrayList<Person> getAddedData(Person o);
    ArrayList<Person> getDeletedData(int index);

}
