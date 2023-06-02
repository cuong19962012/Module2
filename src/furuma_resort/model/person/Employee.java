package furuma_resort.model.person;

public class Employee extends Person {
    private String literacy;
    private String position;
    private double salary;

    public Employee() {
    }

    //    private String name;
    //    private String birthday;
    //    private boolean gender;
    //    private long identityNumber;
    //    private long phoneNumber;
    //    private String email;


    public Employee(String id, String name, String birthday, boolean gender, String identityNumber, String phoneNumber, String email, String literacy, String position, double salary) {
        super(id, name, birthday, gender, identityNumber, phoneNumber, email);
        this.literacy = literacy;
        this.position = position;
        this.salary = salary;
    }


    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public String getBirthday() {
        return super.getBirthday();
    }

    @Override
    public void setBirthday(String birthday) {
        super.setBirthday(birthday);
    }

    @Override
    public boolean isGender() {
        return super.isGender();
    }

    @Override
    public void setGender(boolean gender) {
        super.setGender(gender);
    }

    @Override
    public String getIdentityNumber() {
        return super.getIdentityNumber();
    }

    @Override
    public void setIdentityNumber(String identityNumber) {
        super.setIdentityNumber(identityNumber);
    }

    @Override
    public String getPhoneNumber() {
        return super.getPhoneNumber();
    }

    @Override
    public void setPhoneNumber(String phoneNumber) {
        super.setPhoneNumber(phoneNumber);
    }

    @Override
    public String getEmail() {
        return super.getEmail();
    }

    @Override
    public void setEmail(String email) {
        super.setEmail(email);
    }

    @Override
    public String getId() {
        return super.getId();
    }

    @Override
    public void setId(String id) {
        super.setId(id);
    }

    public String getLiteracy() {
        return literacy;
    }

    public void setLiteracy(String literacy) {
        this.literacy = literacy;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                ", id=" + getId() +
                ", name='" + getName() + '\'' +
                ", birthday='" + getBirthday() + '\'' +
                ", gender=" + isGender() +
                ", identityNumber=" + getIdentityNumber() +
                ", phoneNumber=" + getPhoneNumber() +
                ", email='" + getEmail() + '\'' +
                ", literacy='" + literacy + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + String.format("%.2f", salary) +
                '}';
    }
}
