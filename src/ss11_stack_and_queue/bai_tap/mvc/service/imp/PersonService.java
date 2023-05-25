package ss11_stack_and_queue.bai_tap.mvc.service.imp;

import ss11_stack_and_queue.bai_tap.mvc.model.Person;
import ss11_stack_and_queue.bai_tap.mvc.model.Student;
import ss11_stack_and_queue.bai_tap.mvc.model.Teacher;
import ss11_stack_and_queue.bai_tap.mvc.repository.imp.PersonRepository;
import ss11_stack_and_queue.bai_tap.mvc.service.IPersonService;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PersonService implements IPersonService {
    private static PersonRepository personRepository = new PersonRepository();
    private static Scanner scanner = new Scanner(System.in);

    @Override
    public void display() {
        System.out.println("*** Danh Sách ***");
        for (Person p : personRepository.getData()) {
            System.out.println(p);
        }
    }

    @Override
    public void addPerson() {
        System.out.println("*** Lựa Chọn Thêm ***");
        System.out.println("1. Học Sinh");
        System.out.println("2. Giảng Viên");
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:
                int idStudent;
                do {
                    System.out.print("Nhập ID: ");
                    try {
                        idStudent = Integer.parseInt(scanner.nextLine());
                        break;
                    } catch (NumberFormatException nfe) {
                        System.out.println("Nhập không đúng định dạng");
                    }

                } while (true);
                System.out.print("Nhập Tên: ");
                String nameStudent = scanner.nextLine();
                String birthdayStudent;
                do {
                    System.out.print("Nhập Ngày Tháng Năm Sinh: ");
                    birthdayStudent = scanner.nextLine();
                    String[] checkArr= birthdayStudent.split("");
                    for (int i = 0; i < checkArr.length; i++) {

                    }
                    break;
                } while (true);
                boolean genderStudent;
                do {
                    System.out.print("Nhập Giới Tính: ");
                    try {
                        genderStudent = scanner.nextBoolean();
                        break;
                    } catch (InputMismatchException inputMismatchException) {
                        System.out.println("Nhập không đúng định dạng");
                    }
                } while (true);
                System.out.print("Nhập Lớp ");
                String classes = scanner.nextLine();
                double score;
                do {
                    System.out.print("Nhập Điểm ");
                    try {
                        score = Double.parseDouble(scanner.nextLine());
                        break;
                    } catch (NumberFormatException nfe) {
                        System.out.println("Nhập không đúng định dạng");
                    }
                } while (true);
                Person student = new Student(idStudent, nameStudent, birthdayStudent, genderStudent, classes, score);
                personRepository.addPerson(student);
                break;
            case 2:
                int idTeacher;
                do {
                    System.out.print("Nhập ID: ");
                    try {
                        idTeacher = Integer.parseInt(scanner.nextLine());
                        break;
                    } catch (NumberFormatException numberFormatException) {
                        System.out.println("Nhập không đúng định dạng");
                    }
                } while (true);
                System.out.print("Nhập Tên: ");
                String nameTeacher = scanner.nextLine();
                System.out.print("Nhập Ngày Tháng Năm Sinh: ");
                String birthdayTeacher = scanner.nextLine();
                boolean genderTeacher;
                do {
                    System.out.print("Nhập Giới Tính: ");
                    try {
                        genderTeacher = scanner.nextBoolean();
                        break;
                    } catch (InputMismatchException inputMismatchException) {
                        System.out.println("Nhập không đúng định dạng");
                    }
                } while (true);
                System.out.print("Nhập Chuyên Môn: ");
                String technique = scanner.nextLine();
                Person teacher = new Teacher(idTeacher, nameTeacher, birthdayTeacher, genderTeacher, technique);
                personRepository.addPerson(teacher);
                break;
            default:
                System.out.println("Nhập sai rồi: ");
        }
    }

    @Override
    public void deletePerson(int id) {
        int index = personRepository.searchPerson(id);
        if (index != -1) {
            System.out.println("ID Có Trong Danh Sách :\n" +
                    "'Y' Để Xóa \n" +
                    "Nhập từ khác sẽ quay lại Menu");
            String myChoice = scanner.nextLine();
            if (myChoice.equals("Y")) {
                personRepository.deletePerson(index);
            }
        } else {
            System.out.println("Không Tìm Thấy ID");
        }
    }
}
