package ss10_list.bai_tap.mvc;

public class Service implements IService {
    Repository repository = new Repository();

    @Override
    public Person[] displayList() {
        Person[] dataList = repository.getData();
        for (Person info : dataList) {
            System.out.println(info);
        }
        return dataList;
    }

    public boolean addPerson(Person p) {
        repository.addData(p);
        return true;
    }

    public void deletePerson(int id) {
        Person[] dataArray = repository.getData();
        for (int i = 0; i < dataArray.length; i++) {
            if (dataArray[i].getId() == id) {
                repository.deletedData(i);
                return;
            }
        }
    }
}
