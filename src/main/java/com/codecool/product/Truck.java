package com.codecool.product;

public class Truck extends Product{
    private int wheelsNumber;

    public Truck(String brandName, int quantity, int wheelsNumber) {
        super(brandName, quantity);
        this.wheelsNumber = wheelsNumber;
    }

    public int getWheelsNumber() {
        return wheelsNumber;
    }
}
