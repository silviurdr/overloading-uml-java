package com.codecool.uml.overloading;

import com.codecool.uml.overloading.*;
import jdk.nashorn.api.scripting.ScriptUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Currency;
import java.util.Date;
import java.util.Locale;


public class Webshop {

    private static SimpleDateFormat format = new SimpleDateFormat("dd-mm-yyyy");

    private static Date startDate;

    static {
        try {
            startDate=format.parse("24-10-2010");
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    private static Date endDate;

    static {
        try {
            endDate=format.parse("24-02-2030");
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public Webshop() throws ParseException {
    }

    public static void main(String[] args) {
	// write your code here

    ProductCategory grains = new ProductCategory("Grains", "Food", "Healthy vegan protein");
    Supplier quinoaSupplier = new Supplier("Quinoaers", "Suppliers for quinoa");
    Product quinoa = new Product("Quinoa", 30, Currency.getInstance(Locale.US));
    quinoa.setProductCategory(grains);
    quinoa.setDefaultSupplier( quinoaSupplier);
    FeaturedProductCategory featured = new FeaturedProductCategory(startDate, endDate);

    System.out.println(quinoa.toString() + featured.toString());
    }
}
