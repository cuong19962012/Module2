package ss17_io_binary_file_and_serialization.bai_tap.product_manage.view;

import ss17_io_binary_file_and_serialization.bai_tap.product_manage.controller.ProductController;

public class Main {
    private static ProductController productController = new ProductController();

    public static void main(String[] args) {
        productController.showMenu();
    }
}
