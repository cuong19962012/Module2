package ss12_java_collection_framework.bai_tap.product_management.product_repository.imp;

import ss12_java_collection_framework.bai_tap.product_management.product_repository.CompareAscendingPrice;
import ss12_java_collection_framework.bai_tap.product_management.product_repository.CompareDescendingPrice;
import ss12_java_collection_framework.bai_tap.product_management.product_model.ProductModel;
import ss12_java_collection_framework.bai_tap.product_management.product_repository.IProductRepository;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ProductRepository implements IProductRepository {
    private static ArrayList<ProductModel> data = new ArrayList<>();

    static {
        //int id, String name, int price, String detail
        ProductModel productModel1 = new ProductModel(1, "Nước mắm", 100000, "Cửa khe");
        ProductModel productModel2 = new ProductModel(2, "Bánh Chocolate", 50000, "Bánh trong nước");
        ProductModel productModel3 = new ProductModel(3, "Bột Giặt OMO", 120000, "Bán chạy nhất");
        data.add(productModel1);
        data.add(productModel2);
        data.add(productModel3);
    }


    @Override
    public ArrayList<ProductModel> getData() {
        return data;
    }

    @Override
    public boolean addProduct(ProductModel productModel) {
        for (ProductModel p : data) {
            if (p.getId() == productModel.getId()) {
                return false;
            }
        }
        data.add(productModel);
        return true;
    }

    @Override
    public int check(int id) {
        for (ProductModel p : data) {
            if (p.getId() == id) {
                return data.indexOf(p);
            }
        }
        return -1;
    }

    @Override
    public void deleteProduct(int index) {
        data.remove(index);
    }

    @Override
    public void editProduct(int editId, String editName, int editPrice, String editDetail, int index) {
        if (editId != 0) {
            data.get(index).setId(editId);
        }
        if (!editName.equals("0")) {
            data.get(index).setName(editName);
        }
        if (editPrice != 0) {
            data.get(index).setPrice(editPrice);
        }
        if (editDetail.equals("0")) {
            data.get(index).setDetail(editDetail);
        }
    }

    @Override
    public ArrayList<ProductModel> search(String nameSearch) {
        ArrayList<ProductModel> result = new ArrayList<>();
        for (ProductModel p : data) {
            if (p.getName().toLowerCase().contains(nameSearch.toLowerCase())) {
                result.add(p);
            }
        }
        return result;
    }

    @Override
    public void sortAscending() {
        Collections.sort(data, new CompareAscendingPrice());
    }

    @Override
    public void sortDescending() {
        Comparator comparator = new CompareDescendingPrice();
        Collections.sort(data, comparator);
    }
}
