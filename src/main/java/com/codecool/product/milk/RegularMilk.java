package com.codecool.product.milk;

import com.codecool.date.DateService;
import com.codecool.date.SimpleDate;

public class RegularMilk extends Milk{
    public RegularMilk(String brandName, int quantity, SimpleDate expirationDate) {
        super(brandName, quantity, expirationDate);
    }
}
