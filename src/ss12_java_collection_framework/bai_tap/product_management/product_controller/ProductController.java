package ss12_java_collection_framework.bai_tap.product_management.product_controller;

import ss12_java_collection_framework.bai_tap.product_management.product_service.imp.ProductService;

import java.util.Scanner;

public class ProductController {
    private static Scanner scanner = new Scanner(System.in);
    private static ProductService productService = new ProductService();

    public void showMenu() {
        DO_WHILE:
        do {
            System.out.println("---Chào Mừng Đến Với Của Hàng Của Tôi---");
            System.out.println("1.Hiện Thị Danh Sách Sản Phẩm");
            System.out.println("2.Thêm Sản Phẩm");
            System.out.println("3.Xóa Sản Phẩm");
            System.out.println("4.Sửa Thông Tin Sản Phẩm");
            System.out.println("5.Tìm Kiếm Thông Tin Sản Phẩm");
            System.out.println("6.Sắp Xếp Sản Phẩm ");
            System.out.println("7.Thoát");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    productService.display();
                    break;
                case 2:
                    productService.addProduct();
                    break;
                case 3:
                    productService.deleteProduct();
                    break;
                case 4:
                    productService.editProduct();
                    break;
                case 5:
                    productService.searchProduct();
                    break;
                case 6:
                    productService.sortList();
                    break;
                case 7:
                    break DO_WHILE;
            }
        } while (true);
    }
}
