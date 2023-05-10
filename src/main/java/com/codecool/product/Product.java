package com.codecool.product;

import java.util.UUID;

public abstract class Product {
    private UUID id;
    private String brandName;
    private int quantity;

    public Product(String brandName, int quantity) {
        this.brandName = brandName;
        this.quantity = quantity;
        this.id = UUID.randomUUID();
    }

    public UUID getId() {
        return id;
    }

    public String getBrandName() {
        return brandName;
    }

    public int getQuantity() {
        return quantity;
    }
}
