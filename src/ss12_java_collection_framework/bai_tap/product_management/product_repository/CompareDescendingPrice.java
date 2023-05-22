package ss12_java_collection_framework.bai_tap.product_management.product_repository;

import ss12_java_collection_framework.bai_tap.product_management.product_model.ProductModel;

import java.util.Comparator;

public class CompareDescendingPrice implements Comparator<ProductModel> {
    @Override
    public int compare(ProductModel o1, ProductModel o2) {
        return o2.getPrice() - o1.getPrice();
    }


}
