package ss12_java_collection_framework.bai_tap.product_management.Main;

import ss12_java_collection_framework.bai_tap.product_management.controller.ProductController;

public class View {

    private static ProductController productController = new ProductController();

    public static void main(String[] args) {
        productController.showMenu();
    }
}
