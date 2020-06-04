package com.codecool.uml.overloading;

import java.util.List;

public class Supplier {

    private int id;
    private String name;
    private String description;

    Supplier() {};

    Supplier(String name, String description) {
        this.name = name;
        this.description = description;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description=description;
    }

    public List<Product> getProducts(Warehouse warehouse) {
        return warehouse.getProducts();
    }

    @Override
    public String toString() {
        return "FeaturedSupplier: id: " + this.id + ", name: " + this.name + ", description: " + this.description;
    }
}
