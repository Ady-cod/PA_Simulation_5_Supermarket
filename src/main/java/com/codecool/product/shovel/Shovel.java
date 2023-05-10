package com.codecool.product.shovel;

import com.codecool.product.Product;

public class Shovel extends Product {
    private ShovelSize shovelSize;
    private ShovelMaterial shovelMaterial;

    public Shovel(String brandName, int quantity, ShovelSize shovelSize, ShovelMaterial shovelMaterial) {
        super(brandName, quantity);
        this.shovelSize = shovelSize;
        this.shovelMaterial = shovelMaterial;
    }

    public ShovelSize getShovelSize() {
        return shovelSize;
    }

    public ShovelMaterial getShovelMaterial() {
        return shovelMaterial;
    }
}
