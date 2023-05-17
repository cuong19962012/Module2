package ss8_clean_code_and_refactoring.thuc_hanh.imlements_mvc;

public class Model {
    private int id;
    private String name="Cường";
    private String classes="C03";

    public Model(int id, String name, String classes) {
        this.id = id;
        this.name = name;
        this.classes = classes;
    }

    public Model() {
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getClasses() {
        return classes;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    @Override
    public String toString() {
        return "StudentModel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", classes='" + classes + '\'' +
                '}';
    }
}
