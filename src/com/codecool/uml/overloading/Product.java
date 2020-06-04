package com.codecool.uml.overloading;

import java.util.Currency;

public class Product {

    private int id;

    private String name;

    private float defaultPrice;
    private Currency defaultCurrency;
    private ProductCategory productCategory;
    private Supplier defaultSupplier;

    Product() {

    }

    Product(String name, float defaultPrice, Currency defaultCurrency) {
        this.name = name;
        this.defaultPrice = defaultPrice;
        this.defaultCurrency = defaultCurrency;

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name=name;
    }

    public float getDefaultPrice() {
        return defaultPrice;
    }

    public void setDefaultPrice(float defaultPrice) {
        this.defaultPrice=defaultPrice;
    }

    public Currency getDefaultCurrency() {
        return defaultCurrency;
    }

    public void setDefaultCurrency(Currency defaultCurrency) {
        this.defaultCurrency = defaultCurrency;
    }


    public void setProductCategory(ProductCategory productCategory) {
        this.productCategory = productCategory;
    }

    public ProductCategory getProductCategory() {
        return productCategory;
    }

    public Supplier getDefaultSupplier() {
        return defaultSupplier;
    }

    public void setDefaultSupplier(Supplier defaultSupplier) {
        this.defaultSupplier = defaultSupplier;
    }

    @Override
    public String toString() {
        return "id: " + this.id + ", name: " + this.name + ", default price: " + this.defaultPrice + ", default currency: " +
                this.defaultPrice + ", product category: " + this.productCategory.getName() + ", default supplier: " + defaultSupplier;
    }


}
