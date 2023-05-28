package ss11_stack_and_queue.bai_tap.mvc.repository.imp;

import ss11_stack_and_queue.bai_tap.mvc.model.Person;
import ss11_stack_and_queue.bai_tap.mvc.model.Student;
import ss11_stack_and_queue.bai_tap.mvc.model.Teacher;
import ss11_stack_and_queue.bai_tap.mvc.repository.IRepository;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;

public class PersonRepository implements IRepository {
    private static ArrayList<Person> data = new ArrayList<>();

    static {
        Person student1 = new Student(1, "Loan", "27-06-1994", false, "C03", 7.3);
        Person student2 = new Student(2, "Toàn", "01-03-1996", true, "C03", 7);
        Person student3 = new Student(3, "Tuấn", "03-10-1993", true, "C03", 8.3);
        Person teacher1 = new Teacher(4, "Hoàng", "11-01-1990", true, "Java");
        data.add(student1);
        data.add(student2);
        data.add(student3);
        data.add(teacher1);
    }


    @Override
    public ArrayList<Person> getData() {
        return data;
    }

    @Override
    public void addPerson(Person person) {
        data.add(person);
    }

    @Override
    public int searchPerson(int id) {
        Iterator<Person> iterator = data.iterator();
        while (iterator.hasNext()) {
            Person person = iterator.next();
            if (person.getId() == id) {
                return data.indexOf(person);
            }
        }
        return -1;
    }

    @Override
    public void deletePerson(int index) {
        data.remove(index);
    }

    @Override
    public void writeData() {
        final String COMA=",";
        File fileStudent = new File("src/ss11_stack_and_queue/bai_tap/mvc/io_text/list_students.csv");
        File fileTeacher = new File("src/ss11_stack_and_queue/bai_tap/mvc/io_text/list_teacher.csv");
        try {
            FileWriter fileWriterStudent = new FileWriter(fileStudent);
            BufferedWriter bufferedWriterStudent = new BufferedWriter(fileWriterStudent);
            FileWriter fileWriterTeacher = new FileWriter(fileTeacher);
            BufferedWriter bufferedWriterTeacher = new BufferedWriter(fileWriterTeacher);
            for (Person p : data) {
                if (p instanceof Student) {
                    //(1, "Loan", "27-06-1994", false, "C03", 7.3);
                    String str = p.getId()+COMA+p.getName()+COMA+p.getBirthday()+COMA+p.isGender()+COMA+((Student) p).getClasses()+COMA+((Student) p).getScore();
                    bufferedWriterStudent.write(str);
                    bufferedWriterStudent.newLine();
                } else {
                    String str=p.getId()+COMA+p.getName()+COMA+p.getBirthday()+COMA+p.isGender()+COMA+((Teacher)p).getTechnique();
                    bufferedWriterTeacher.write(str);
                    bufferedWriterTeacher.newLine();
                }
            }
            bufferedWriterTeacher.close();
            bufferedWriterStudent.close();
            fileWriterStudent.close();
            fileWriterTeacher.close();
        }
        catch (FileNotFoundException fileNotFoundException){
            System.out.println("Không tìm thấy File!!");
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
