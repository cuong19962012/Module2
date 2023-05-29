package ss17_io_binary_file_and_serialization.bai_tap.product_manage.service.imp;

import ss17_io_binary_file_and_serialization.bai_tap.product_manage.model.Product;
import ss17_io_binary_file_and_serialization.bai_tap.product_manage.repository.imp.ProductRepository;
import ss17_io_binary_file_and_serialization.bai_tap.product_manage.service.IProductService;

import java.util.List;
import java.util.Scanner;

public class ProductService implements IProductService {
    private static ProductRepository productRepository = new ProductRepository();
    private Scanner scanner = new Scanner(System.in);

    @Override
    public void display() {
        List<Product> list = productRepository.getData();
        for (Product p : list) {
            System.out.println(p);
        }
    }

    @Override
    public void addProduct() {
        int id;
        String name;
        long price;
        String maker;
        String description;
        do {
            System.out.println("Nhập mã sản phẩm");
            try {
                id = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Lỗi định dạng!");
            } catch (Exception e) {
                System.out.println("Lỗi");
            }
        } while (true);
        System.out.println("Nhập tên sản phẩm");
        name = scanner.nextLine();
        do {
            System.out.println("Nhập giá sản phẩm");
            try {
                price = Long.parseLong(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Lỗi định dạng!");
            } catch (Exception e) {
                System.out.println("Lỗi");
            }
        } while (true);
        System.out.println("Nhập hãng sản xuất");
        maker = scanner.nextLine();
        System.out.println("Nhập mô tả sản phẩm");
        description = scanner.nextLine();
        productRepository.addProduct(new Product(id, name, price, maker, description));
    }

    @Override
    public void searchProduct() {
        System.out.print("Nhập tên: ");
        String name = scanner.nextLine();
        Product searchProduct = productRepository.searchProduct(name);
        if (searchProduct != null)
            System.out.println(searchProduct);
        else
            System.out.println("Không tìm thấy");
    }
}
