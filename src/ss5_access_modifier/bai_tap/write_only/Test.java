package ss5_access_modifier.bai_tap.write_only;

public class Test {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Ana");
        student.setClasses("C02");
        System.out.printf(student.getInfo());
    }
}
