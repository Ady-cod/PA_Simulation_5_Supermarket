package com.codecool;

import com.codecool.company.Supermarket;
import com.codecool.date.FullDate;
import com.codecool.date.SimpleDate;
import com.codecool.product.Truck;
import com.codecool.product.milk.LongLastingMilk;
import com.codecool.product.milk.Milk;
import com.codecool.product.milk.RegularMilk;
import com.codecool.product.shovel.Shovel;
import com.codecool.product.shovel.ShovelMaterial;
import com.codecool.product.shovel.ShovelSize;

public class Main {
    public static void main(String[] args) {

        Milk milk1 = new RegularMilk("Zuzu",5,new SimpleDate(10,10));
        Milk milk2 = new RegularMilk("Covasna",10,new SimpleDate(3,5));
        Milk milk3 = new RegularMilk("Rarau",15,new SimpleDate(7,6));

        Milk milk4 = new LongLastingMilk("Zuzu",8,new FullDate(5,5,2023));
        Milk milk5 = new LongLastingMilk("Covasna",9,new FullDate(7,2,2024));
        Milk milk6 = new LongLastingMilk("Rarau",17,new FullDate(25,4,2024));

        Shovel shovel1 = new Shovel("Bosh",50, ShovelSize.BIG_SIZE, ShovelMaterial.STEEL);
        Shovel shovel2 = new Shovel("Gradina Mea",20, ShovelSize.NORMAL, ShovelMaterial.PLASTIC);
        Shovel shovel3 = new Shovel("Reinforcer",5, ShovelSize.SMALL, ShovelMaterial.ALUMINIUM);

        Truck truck1 = new Truck("Caterpillar",2,8);
        Truck truck2 = new Truck("Mack",2,14);
        Truck truck3 = new Truck("Volvo",3,12);

        Supermarket supermarket = new Supermarket();
        supermarket.addProduct(milk1);
        supermarket.addProduct(milk2);
        supermarket.addProduct(milk3);
        supermarket.addProduct(milk4);
        supermarket.addProduct(milk5);
        supermarket.addProduct(milk6);
        supermarket.addProduct(shovel1);
        supermarket.addProduct(shovel2);
        supermarket.addProduct(shovel3);
        supermarket.addProduct(truck1);
        supermarket.addProduct(truck2);
        supermarket.addProduct(truck3);

        supermarket.displayCurrentStock();



    }
}