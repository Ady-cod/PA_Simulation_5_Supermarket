package com.codecool.product.milk;

import com.codecool.date.DateService;
import com.codecool.product.Product;

public abstract class Milk extends Product {

    protected DateService expirationDate;

    public Milk(String brandName, int quantity, DateService expirationDate) {
        super(brandName, quantity);
        this.expirationDate = expirationDate;
    }


    public DateService getExpirationDateObject() {
        return expirationDate;
    }

}
