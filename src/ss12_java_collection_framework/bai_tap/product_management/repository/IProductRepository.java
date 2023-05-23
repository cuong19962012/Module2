package ss12_java_collection_framework.bai_tap.product_management.repository;

import ss12_java_collection_framework.bai_tap.product_management.model.ProductModel;

import java.util.ArrayList;

public interface IProductRepository {
    ArrayList<ProductModel> getData();


    boolean addProduct(ProductModel productModel);

    int check(int id);

    void deleteProduct(int index);

    void editProduct(int editId, String editName, int editPrice, String editDetail, int index);

    ArrayList<ProductModel> search(String nameSearch);

    void sortAscending();

    void sortDescending();
}
