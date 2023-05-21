package ss11_stack_and_queue.bai_tap.mvc.model;

public abstract class Person {
    private  int id;
    private String name;
    private String birthday;
    private boolean gender;
    public Person(){

    }

    public Person(int id, String name, String birthday, boolean gender) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getBirthday() {
        return birthday;
    }

    public boolean isGender() {
        return gender;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    @Override
    public abstract String toString();
}
