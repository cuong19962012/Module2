package ss11_stack_and_queue.bai_tap.mvc.controller;

import ss11_stack_and_queue.bai_tap.mvc.service.imp.PersonService;

import javax.swing.*;
import java.util.InputMismatchException;
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
            do {
                try {
                    choice = Integer.parseInt(scanner.nextLine());
                    break;
                } catch (NumberFormatException nfe) {
                    System.out.println("Sai định dạng vui lòng nhập lại");
                } catch (Exception e) {
                    System.out.println("Sai rồi! Nhập lại");
                }
            } while (true);
            switch (choice) {
                case 1:
                    personService.display();
                    break;
                case 2:
                    personService.addPerson();
                    break;
                case 3:
                    int id;
                    System.out.print("Nhập ID Muốn Xóa: ");
                    do {
                        try {
                            id = Integer.parseInt(scanner.nextLine());
                            break;
                        } catch (NumberFormatException nfe) {
                            System.out.println("Nhập sai rồi! nhập lại");
                        } catch (Exception e) {
                            System.out.println("Nhập sai rồi! nhập lại");
                        }
                    } while (true);
                    personService.deletePerson(id);
                    break;
                case 4:
                    break DO_WHILE;
            }
        } while (true);
    }
}