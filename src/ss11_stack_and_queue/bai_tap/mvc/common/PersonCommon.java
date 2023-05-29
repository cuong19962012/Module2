package ss11_stack_and_queue.bai_tap.mvc.common;

import ss11_stack_and_queue.bai_tap.mvc.model.Person;
import ss11_stack_and_queue.bai_tap.mvc.model.Student;
import ss11_stack_and_queue.bai_tap.mvc.model.Teacher;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class PersonCommon {
    public List<Person> readFile() {
        List<Person> list = new ArrayList<>();
        File fileStudent = new File("src/ss11_stack_and_queue/bai_tap/mvc/common/list_students.csv");
        File fileTeacher = new File("src/ss11_stack_and_queue/bai_tap/mvc/common/list_teacher.csv");
        try {
            FileReader fileReaderStudent = new FileReader(fileStudent);
            FileReader fileReaderTeacher = new FileReader(fileTeacher);
            BufferedReader bufferedReaderStudent = new BufferedReader(fileReaderStudent);
            BufferedReader bufferedReaderTeacher = new BufferedReader(fileReaderTeacher);
            String line;
            while ((line = bufferedReaderStudent.readLine()) != null) {
                String[] arr = line.split(",");//int id, String name, String birthday, boolean gender, String classes, double score
                list.add(new Student(Integer.parseInt(arr[0]), arr[1], arr[2], Boolean.parseBoolean(arr[3]), arr[4], Double.parseDouble(arr[5])));
            }
            while ((line = bufferedReaderTeacher.readLine()) != null) {
                String[] arr = line.split(",");//int id, String name, String birthday, boolean gender, String technique
                list.add(new Teacher(Integer.parseInt(arr[0]), arr[1], arr[2], Boolean.parseBoolean(arr[3]), arr[4]));
            }
            bufferedReaderStudent.close();
            bufferedReaderTeacher.close();
            fileReaderTeacher.close();
            fileReaderStudent.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return list;
    }

    public void writeFile(List<Person> list) {
        final String COMA = ",";
        File fileStudent = new File("src/ss11_stack_and_queue/bai_tap/mvc/common/list_students.csv");
        File fileTeacher = new File("src/ss11_stack_and_queue/bai_tap/mvc/common/list_teacher.csv");
        try {
            FileWriter fileWriterStudent = new FileWriter(fileStudent);
            BufferedWriter bufferedWriterStudent = new BufferedWriter(fileWriterStudent);
            FileWriter fileWriterTeacher = new FileWriter(fileTeacher);
            BufferedWriter bufferedWriterTeacher = new BufferedWriter(fileWriterTeacher);
            for (Person p : list) {
                if (p instanceof Student) {
                    //(1, "Loan", "27-06-1994", false, "C03", 7.3);
                    String str = p.getId() + COMA + p.getName() + COMA + p.getBirthday() + COMA + p.isGender() + COMA + ((Student) p).getClasses() + COMA + ((Student) p).getScore();
                    bufferedWriterStudent.write(str);
                    bufferedWriterStudent.newLine();
                } else {
                    String str = p.getId() + COMA + p.getName() + COMA + p.getBirthday() + COMA + p.isGender() + COMA + ((Teacher) p).getTechnique();
                    bufferedWriterTeacher.write(str);
                    bufferedWriterTeacher.newLine();
                }
            }
            bufferedWriterTeacher.close();
            bufferedWriterStudent.close();
            fileWriterStudent.close();
            fileWriterTeacher.close();
        } catch (FileNotFoundException fileNotFoundException) {
            System.out.println("Không tìm thấy File!!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
