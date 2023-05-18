package ss10_list.bai_tap.mvc;

import java.util.ArrayList;

public class Repository {
    //int id, String name, String birthday, boolean gender, String classes, int score
    private static ArrayList<Person> data = new ArrayList<>();

    static {
        Person student1 = new Student(01, "Loan", "27-06-1994", false, "C03", 7.3);
        Person student2 = new Student(02, "Toàn", "01-03-1996", true, "C03", 7);
        Person student3 = new Student(03, "Tuấn", "03-10-1993", true, "C03", 8.3);
        Person teacher1 = new Teacher(04, "Hoàng", "11-01-1990", true, "Java");
        data.add(student1);
        data.add(student2);
        data.add(student3);
    }

}
