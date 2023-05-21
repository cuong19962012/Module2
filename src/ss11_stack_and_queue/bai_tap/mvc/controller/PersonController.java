package ss11_stack_and_queue.bai_tap.mvc.controller;

import ss11_stack_and_queue.bai_tap.mvc.service.imp.PersonService;

import java.util.Scanner;

public class PersonController {
    private static PersonService personService = new PersonService();
    private static Scanner scanner = new Scanner(System.in);

    public void showMenu() {
        int choice;
        DO_WHILE:
        do {
            System.out.println("---Menu---");
            System.out.println("1.Hiện thị danh sách \n" +
                    "2.Thêm học viên hoặc giảng viên\n" +
                    "3.Xóa học viên hoặc giảng viên \n" +
                    "4.Thoát");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    personService.display();
                    break;
                case 2:
                    personService.addPerson();
                    break;
                case 3:
                    System.out.print("Nhập ID Muốn Xóa: ");
                    int id = scanner.nextInt();
                    personService.deletePerson(id);
                    break;
                case 4:
                    break DO_WHILE;
            }
        } while (true);
    }
}