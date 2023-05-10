package com.codecool.company;

import com.codecool.product.Product;
import com.codecool.product.Truck;
import com.codecool.product.milk.Milk;
import com.codecool.product.milk.LongLastingMilk;
import com.codecool.product.milk.RegularMilk;
import com.codecool.product.shovel.Shovel;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Supermarket {
    private List<Product> products;

    public Supermarket() {
        this.products = new ArrayList<>();
    }
    public void addProduct(Product product){
        this.products.add(product);
    }

    public List<Product> getProducts() {
        return products;
    }
    public void displayCurrentStock(){
            StockStatus stockStatus = selectAvailableProductsInStock();
            List<Milk>milkItems = stockStatus.validMilkItems;
            List<Shovel>shovels = stockStatus.validShovelItems;
            List<Truck>trucks = stockStatus.validTruckItems;

        System.out.println();
        System.out.println("Here it is the list of the stock products: ");
        System.out.println();
        System.out.println("Milk products");
        for(Milk milk : milkItems) {
            String formattedString = String.format("Brand name: %s, Product ID: %s, Quantity: %d",
                    milk.getBrandName(),milk.getId(),milk.getQuantity());
            System.out.println(formattedString);
        }
        System.out.println();
        System.out.println("Shovel items: ");
        for (Shovel shovel : shovels){
            String formattedString = String.format("Brand name: %s, Product ID: %s, Quantity: %d, Shovel Size: " +
                            "%s Shovel Material: %s",
                    shovel.getBrandName(),shovel.getId(),shovel.getQuantity(),shovel.getShovelSize(),
                    shovel.getShovelMaterial());
            System.out.println(formattedString);
        }
        System.out.println();
        System.out.println("Tucks: ");
        for (Truck truck : trucks){
            String formattedString = String.format("Brand name: %s, Product ID: %s, Quantity: %d, Wheels Number: %d",
                    truck.getBrandName(),truck.getId(),truck.getQuantity(),truck.getWheelsNumber());
            System.out.println(formattedString);
        }
        System.out.println();
        System.out.println("Due to the expiration date, a number of " + stockStatus.numberOfSourMilk +
                " milk items were declared sour and removed from the stock");
    }
    private StockStatus selectAvailableProductsInStock(){
        LocalDate currentDate = LocalDate.now();
        int day = currentDate.getDayOfMonth();
        int month = currentDate.getMonthValue();
        int year = currentDate.getYear();
        StockStatus stockStatus = new StockStatus();
        for (Product product : products){
            if(product instanceof RegularMilk) {
                // Check if expiration date of the RegularMilk is already reached
                if( month > ((RegularMilk) product).getExpirationDateObject().getDateValuesArray()[1]
                    || month == ((RegularMilk) product).getExpirationDateObject().getDateValuesArray()[1]
                    && day >= ((RegularMilk) product).getExpirationDateObject().getDateValuesArray()[0]){
                stockStatus.increaseNumberOfSourMilk();
                // Check if the expiration date of the RegularMilk is not reached
                } else {
                    stockStatus.addValidMilkItem((RegularMilk)product);
                }
            }
            if (product instanceof LongLastingMilk){
                // Check if expiration date of the RegularMilk is already reached
                if (year > ((LongLastingMilk) product).getExpirationDateObject().getDateValuesArray()[2]
                || month == ((LongLastingMilk) product).getExpirationDateObject().getDateValuesArray()[1]
                        && day >= ((LongLastingMilk) product).getExpirationDateObject().getDateValuesArray()[0]){
                    stockStatus.increaseNumberOfSourMilk();
                    // Check if the expiration date of the RegularMilk is not reached
                } else {
                    stockStatus.addValidMilkItem((LongLastingMilk) product);
                }
            }
            if (product instanceof Shovel){
                stockStatus.addValidShovelItem((Shovel)product);
            }
            if (product instanceof Truck){
                stockStatus.addValidTruckItem((Truck)product);
            }
        }
        return stockStatus;
    }
}
