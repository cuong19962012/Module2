package ss17_io_binary_file_and_serialization.bai_tap.product_manage.repository.imp;

import ss17_io_binary_file_and_serialization.bai_tap.product_manage.common.ProductCommon;
import ss17_io_binary_file_and_serialization.bai_tap.product_manage.model.Product;
import ss17_io_binary_file_and_serialization.bai_tap.product_manage.repository.IProductRepository;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements IProductRepository {

    static ProductCommon productCommon = new ProductCommon();

    static {
        List<Product> list = new ArrayList<>();
        Product product1 = new Product(1, "Kẹo Bốn mùa", 20000, "AceCook", "Kẹo trẻ em");
        Product product2 = new Product(2, "Bánh Baby", 10000, "AceCook", "Bánh trẻ em");
        Product product3 = new Product(3, "Râu Cau Long Hải", 10000, "AceCook", "Sản xuất tại Long Hải");
        list.add(product1);
        list.add(product2);
        list.add(product3);
        productCommon.writeFile(list);
    }

    @Override
    public List<Product> getData() {
        return productCommon.readFile();
    }

    @Override
    public void addProduct(Product product) {
        List<Product> list = productCommon.readFile();
        list.add(product);
        productCommon.writeFile(list);
    }

    @Override
    public Product searchProduct(String name) {
        List<Product> list = productCommon.readFile();
        for (Product p : list) {
            if (p.getName().equals(name))
                return p;
        }
        return null;
    }

}
