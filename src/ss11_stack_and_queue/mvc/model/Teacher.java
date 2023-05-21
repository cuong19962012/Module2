package ss11_stack_and_queue.mvc.model;

public class Teacher extends Person {
    private String technique;

    public Teacher() {
    }

    public Teacher(String technique) {
        this.technique = technique;
    }

    public Teacher(int id, String name, String birthday, boolean gender, String technique) {
        super(id, name, birthday, gender);
        this.technique = technique;
    }

    public String getTechnique() {
        return technique;
    }

    public void setTechnique(String technique) {
        this.technique = technique;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                ", ID='" + super.getId() + '\'' +
                ", Name='" + super.getName() + '\'' +
                ", Birthday='" + super.getBirthday() + '\'' +
                ", Gender='" + super.isGender() + '\'' +
                ", Technique=" + technique +
                '}';
    }
}
