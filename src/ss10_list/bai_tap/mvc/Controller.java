package ss10_list.bai_tap.mvc;

import java.util.Scanner;

public class Controller {
    Service service = new Service();

    public void showMenu() {
        int choice;
        Scanner scanner = new Scanner(System.in);
        DO_WHILE:
        do {
            System.out.println("---Menu---");
            System.out.println("1.Hiện thị danh sách \n" +
                    "2.Thêm học viên hoặc giảng viên\n" +
                    "3.Xóa học viên hoặc giảng viên \n" +
                    "4.Thoát");
            choice = Integer.parseInt(scanner.nextLine());
            SWITCH_CHOICE:
            switch (choice) {
                case 1:
                    System.out.println("* Danh sách *");
                    service.displayList();
                    break;
                case 2:
                    int myChoice;
                    System.out.println("* Thông tin đối tượng *");
                    do {
                        System.out.println("1 Học sinh\n" +
                                "2. Giảng Viên");

                        myChoice = Integer.parseInt(scanner.nextLine());
                    } while (myChoice != 1 && myChoice != 2);
                    choiceAddObject(myChoice);
                    break;
                case 3:
                    int idForDelete;
                    boolean idIsHas = false;
                    String will;
                    do {
                        System.out.print("Nhập ID của người muốn xóa: ");
                        idForDelete = Integer.parseInt(scanner.nextLine());

                        for (int i = 0; i < service.repository.getData().length; i++) {
                            if (service.repository.getData()[i].getId() == idForDelete) {
                                idIsHas = true;
                                break;
                            }

                        }

                    } while (!idIsHas);

                    do {
                        System.out.println("ID có trong danh sách\n" +
                                "Nhập 'Yes' để xóa và quay trở lại menu \n" +
                                "Nhập 'No' để quay trở lại menu không xóa");
                        will = scanner.nextLine();
                        if (will.equals("Yes")) {
                            {
                                service.deletePerson(idForDelete);
                                break SWITCH_CHOICE;
                            }
                        } else if (will.equals("No")) {
                            break SWITCH_CHOICE;
                        } else {
                            System.out.println("Nhập lại cho đúng");
                        }
                    } while (true);
                case 4:
                    break DO_WHILE;
                default:
                    System.out.println("Error");
            }
        } while (true);
    }

    private void choiceAddObject(int myChoice) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập ID: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập Tên: ");
        String name = scanner.nextLine();
        System.out.print("Nhập Ngày Tháng Năm Sinh: ");
        String birthday = scanner.nextLine();
        System.out.print("Nhập Giới Tính: ");
        boolean gender = Boolean.parseBoolean(scanner.nextLine());
        switch (myChoice) {
            case 1:// choice Student
                System.out.print("Nhập Lớp ");
                String classes = scanner.nextLine();
                System.out.print("Nhập Điểm ");
                double score = scanner.nextDouble();
                Person newStudent = new Student(id, name, birthday, gender, classes, score);
                if (service.addPerson(newStudent))
                    System.out.println("Thêm thành công");
                break;
            case 2:// choice Teacher
                System.out.print("Nhập Chuyên Môn: ");
                String technique = scanner.nextLine();
                Person newTeacher = new Teacher(id, name, birthday, gender, technique);
                if (service.addPerson(newTeacher))
                    System.out.println("Thêm thành công");
                break;

        }
    }
}
