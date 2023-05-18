package ss10_list.bai_tap.mvc;

import java.util.Scanner;

public class Controller {
    Service service = new Service();

    public void showMenu() {
        int choice;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("---Menu---");
            System.out.println("1.Hiện thị danh sách \n" +
                    "2.Thêm học viên hoặc giảng viên\n" +
                    "3.Xóa học viên hoặc giảng viên \n" +
                    "4.Thoát");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Error");
            }
        } while (true);
    }
}
