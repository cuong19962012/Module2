package ss5_access_modifier.bai_tap.write_only;

public class Student {
    private String name = "John";
    private String classes = "C02";

    public void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public String getInfo() {
        return "Name: " + name + " Classes: " + classes;
    }
}
