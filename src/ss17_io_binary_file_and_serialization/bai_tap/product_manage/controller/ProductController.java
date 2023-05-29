package ss17_io_binary_file_and_serialization.bai_tap.product_manage.controller;

import ss17_io_binary_file_and_serialization.bai_tap.product_manage.service.imp.ProductService;

import java.io.IOException;
import java.util.Scanner;

public class ProductController {
    private Scanner scanner = new Scanner(System.in);
    ProductService productService = new ProductService();

    public void showMenu() {
        DO_WHILE:
        do {
            System.out.println("---Menu---");
            System.out.println("1.Hiện thị danh sách");
            System.out.println("2.Thêm sản phẩm");
            System.out.println("3.Tìm kiếm sản phẩm");
            System.out.println("4.Thoát");
            int choice;
            do {
                try {
                    choice = Integer.parseInt(scanner.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Sai định dạng rồi");
                } catch (Exception e) {
                    System.out.println("Có lỗi rồi");
                }

            } while (true);
            switch (choice) {
                case 1:
                    productService.display();
                    break;
                case 2:
                    productService.addProduct();
                    break;
                case 3:
                    productService.searchProduct();
                    break;
                case 4:
                    break DO_WHILE;
                default:
                    System.out.println("Không thuộc tùy chọn");
            }
        } while (true);
    }
}
