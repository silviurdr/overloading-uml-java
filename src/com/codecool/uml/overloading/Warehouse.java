package com.codecool.uml.overloading;

import java.util.ArrayList;
import java.util.List;
import com.codecool.uml.overloading.Product;

public class Warehouse {

    private List<Product> productList = new ArrayList<>();

    public void addProduct(Product product) {
        productList.add(product);
    }

    public List<Product> getProducts() {
        return productList;
    }

    Warehouse warehouse = new Warehouse();

    public List<Product> getAllProductsBy(ProductCategory productCategory) {
        return productCategory.getProducts(warehouse);
    }

    public List<Product> getAllProductsBy(Supplier supplier) {
        return supplier.getProducts(warehouse);
    }


}
