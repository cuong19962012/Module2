package ss12_java_collection_framework.bai_tap.product_management.product_repository;

import ss12_java_collection_framework.bai_tap.product_management.product_model.ProductModel;

import java.util.Comparator;

public class CompareAscendingPrice implements Comparator<ProductModel> {
    @Override
    public int compare(ProductModel o1, ProductModel o2) {
        return o1.getPrice() - o2.getPrice();
    }
}
