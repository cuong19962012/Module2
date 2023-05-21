package ss11_stack_and_queue.mvc.model;

public class Student extends Person {
    private String classes;
    private double score;

    public Student() {
    }

    public Student(int id, String name, String birthday, boolean gender, String classes, double score) {
        super(id, name, birthday, gender);
        this.classes = classes;
        this.score = score;
    }

    public String getClasses() {
        return classes;
    }

    public double getScore() {
        return score;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                ", ID='" + super.getId() + '\'' +
                ", Name='" + super.getName() + '\'' +
                ", Birthday='" + super.getBirthday() + '\'' +
                ", Gender='" + super.isGender() + '\'' +
                ", classes='" + classes + '\'' +
                ", score=" + score +
                '}';
    }
}
