package ss12_java_collection_framework.bai_tap.product_management.product_service.imp;

import ss12_java_collection_framework.bai_tap.product_management.model.ProductModel;
import ss12_java_collection_framework.bai_tap.product_management.repository.imp.ProductRepository;
import ss12_java_collection_framework.bai_tap.product_management.product_service.IProductService;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ProductService implements IProductService {
    private static ProductRepository productRepository = new ProductRepository();
    private static Scanner scanner = new Scanner(System.in);

    @Override
    public void display() {
        ArrayList<ProductModel> list = productRepository.getData();
        Iterator<ProductModel> model = list.iterator();
        while (model.hasNext()) {
            System.out.println(model.next());
        }
    }

    @Override
    public void addProduct() {
        System.out.print("Nhập ID: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập Tên: ");
        String name = scanner.nextLine();
        System.out.print("Nhập Giá: ");
        int price = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập Chi Tiết: ");
        String detail = scanner.nextLine();
        if (productRepository.addProduct(new ProductModel(id, name, price, detail)))
            System.out.println("Đã Thêm Thành Công");
        else
            System.out.println("Thêm Thất Bại");
    }

    @Override
    public void deleteProduct() {
        System.out.print("Nhập ID Của Sản Phẩm Cần Xóa: ");
        int id = Integer.parseInt(scanner.nextLine());
        int index = productRepository.check(id);
        if (index != -1) {
            System.out.println("Sản Phẩm Có Trong Danh Sách!!!");
            System.out.println("Nhấn 'Y' Để Xóa");
            String myChoice = scanner.nextLine();
            if (myChoice.equals("Y")) {
                productRepository.deleteProduct(index);
            }
        } else {
            System.out.println("Sản Phẩm Không Có Trong Danh Sách");
        }
    }

    @Override
    public void editProduct() {
        System.out.print("Nhập ID Của Sản Phẩm Cần Sửa: ");
        int id = Integer.parseInt(scanner.nextLine());
        int index = productRepository.check(id);
        if (index != -1) {
            System.out.println("Sản Phẩm Có Trong Danh Sách!!!");
            System.out.println("Nếu Không Sửa Gì Thì Nhập 0");
            System.out.print("Sửa ID: ");
            int editId = Integer.parseInt(scanner.nextLine());
            System.out.print("Sửa Tên: ");
            String editName = scanner.nextLine();
            System.out.print("Sửa Giá: ");
            int editPrice = Integer.parseInt(scanner.nextLine());
            System.out.print("Sửa Chi Tiết: ");
            String editDetail = scanner.nextLine();
            productRepository.editProduct(editId, editName, editPrice, editDetail, index);
        } else {
            System.out.println("Sản Phẩm Không Có Trong Danh Sách");
        }
    }

    @Override
    public void searchProduct() {
        System.out.println("--Tìm Kiếm Theo Tên--");
        System.out.print("Nhập Tên Ở Đây: ");
        String nameSearch = scanner.nextLine();
        ArrayList<ProductModel> result = productRepository.search(nameSearch);
        if (result == null) {
            System.out.println("Không Tìm Thấy");
        } else {
            for (ProductModel p : result) {
                System.out.println(p);
            }
        }
    }

    @Override
    public void sortList() {
        System.out.println("1.Xếp Tăng Dần Theo Giá");
        System.out.println("2.Xếp Giảm Dần Theo Giá");
        int choice = scanner.nextInt();
        if (choice == 1) {
            productRepository.sortAscending();
        } else if (choice == 2) {
            productRepository.sortDescending();
        }
    }
}
