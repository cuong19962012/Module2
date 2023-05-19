package ss10_list.bai_tap.mvc;

public interface IRepository {
    Person[] getData();

    void addData(Person o);

    Person deletedData(int index);

}
