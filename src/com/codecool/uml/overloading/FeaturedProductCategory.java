package com.codecool.uml.overloading;

import java.util.Date;

public class FeaturedProductCategory extends ProductCategory {

    private Date startDate;
    private Date endDate;

    FeaturedProductCategory(Date startDate, Date endDate) {
        this.startDate = startDate;
        this.endDate = endDate;
    }


    public void schedule(Date startDate, Date endDate) {
    }

    @Override
    public String toString() {
        return "FeaturedProductCategory: startDate: " + this.startDate + ", endDate: " + endDate;
    }

}
