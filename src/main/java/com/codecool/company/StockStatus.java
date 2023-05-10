package com.codecool.company;

import com.codecool.product.Truck;
import com.codecool.product.milk.Milk;
import com.codecool.product.shovel.Shovel;

import java.util.ArrayList;
import java.util.List;

public class StockStatus {
    int numberOfSourMilk;
    List<Milk> validMilkItems;
    List<Shovel>validShovelItems;
    List<Truck>validTruckItems;

    public StockStatus() {
        this.numberOfSourMilk =0;
        this.validMilkItems = new ArrayList<>();
        this.validShovelItems = new ArrayList<>();
        this.validTruckItems = new ArrayList<>();
    }
    public void increaseNumberOfSourMilk(){
        numberOfSourMilk++;
    }
    public void addValidMilkItem(Milk milk){
        validMilkItems.add(milk);
    }
    public void addValidShovelItem(Shovel shovel){
        validShovelItems.add(shovel);
    }
    public void addValidTruckItem(Truck truck){
        validTruckItems.add(truck);
    }

    public int getNumberOfSourMilk() {
        return numberOfSourMilk;
    }

    public List<Milk> getValidMilkItems() {
        return validMilkItems;
    }

    public List<Shovel> getValidShovelItems() {
        return validShovelItems;
    }

    public List<Truck> getValidTruckItems() {
        return validTruckItems;
    }
}
