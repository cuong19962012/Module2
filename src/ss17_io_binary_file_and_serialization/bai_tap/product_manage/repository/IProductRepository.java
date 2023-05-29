package ss17_io_binary_file_and_serialization.bai_tap.product_manage.repository;

import ss17_io_binary_file_and_serialization.bai_tap.product_manage.model.Product;

import java.util.List;

public interface IProductRepository {
    List<Product> getData();

    void addProduct(Product product);

    Product searchProduct(String name);
}
