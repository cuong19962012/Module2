package ss8_clean_code_and_refactoring.thuc_hanh.imlements_mvc;

import java.util.Scanner;

public class StudentController {
    StudentService studentService = new StudentService();

    public void show_menu() {
        Scanner scanner = new Scanner(System.in);
        MENU_WHILE:
        do {
            int choice;
            System.out.println("---Hệ thống quản lí sinh viên---");
            System.out.print("1. Hiện thị danh sách \n" +
                    "2. Thêm sinh viên\n" +
                    "3. Xóa sinh viên\n" +
                    "4. Thoát ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("*Danh sách học sinh*");
                    studentService.display();
                    break;
                case 2:
                    System.out.println("*Thông tin của học sinh cần thêm*");
                    System.out.println("Nhập ID: ");
                    int idAdd = Integer.parseInt(scanner.nextLine());
                    System.out.println("Nhập Tên : ");
                    String name = scanner.nextLine();
                    System.out.println("Nhập Lớp : ");
                    String classes = scanner.nextLine();
                    if(studentService.add(idAdd, name, classes)!=null)
                    {
                        System.out.println("Đã thêm thành công");
                    }else {
                        System.out.println("Thêm thất bại!!! Mảng đã hết chỗ để thêm");
                    }
                    studentService.display();
                    break;
                case 3:
                    System.out.println("Nhập ID để xóa: ");
                    int idDelete = Integer.parseInt(scanner.nextLine());

                    if(studentService.delete(idDelete)!=null){
                        System.out.println("Xóa thành Công!!!");
                    }else {
                        System.out.println("Nhập sai ID!!!");
                    }
                    studentService.display();
                    break;
                case 4:
                    break MENU_WHILE;
            }
        } while (true);
    }
}
