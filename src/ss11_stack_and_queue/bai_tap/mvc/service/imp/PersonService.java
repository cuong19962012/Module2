package ss11_stack_and_queue.bai_tap.mvc.service.imp;

import ss11_stack_and_queue.bai_tap.mvc.model.Person;
import ss11_stack_and_queue.bai_tap.mvc.model.Student;
import ss11_stack_and_queue.bai_tap.mvc.model.Teacher;
import ss11_stack_and_queue.bai_tap.mvc.repository.imp.PersonRepository;
import ss11_stack_and_queue.bai_tap.mvc.service.IPersonService;

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
                System.out.print("Nhập ID: ");
                int idStudent = Integer.parseInt(scanner.nextLine());
                System.out.print("Nhập Tên: ");
                String nameStudent = scanner.nextLine();
                System.out.print("Nhập Ngày Tháng Năm Sinh: ");
                String birthdayStudent = scanner.nextLine();
                System.out.print("Nhập Giới Tính: ");
                boolean genderStudent = Boolean.parseBoolean(scanner.nextLine());
                System.out.print("Nhập Lớp ");
                String classes = scanner.nextLine();
                System.out.print("Nhập Điểm ");
                double score = scanner.nextDouble();
                Person student = new Student(idStudent, nameStudent, birthdayStudent, genderStudent, classes, score);
                personRepository.addPerson(student);
                break;
            case 2:
                System.out.print("Nhập ID: ");
                int idTeacher = Integer.parseInt(scanner.nextLine());
                System.out.print("Nhập Tên: ");
                String nameTeacher = scanner.nextLine();
                System.out.print("Nhập Ngày Tháng Năm Sinh: ");
                String birthdayTeacher = scanner.nextLine();
                System.out.print("Nhập Giới Tính: ");
                boolean genderTeacher = Boolean.parseBoolean(scanner.nextLine());
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
