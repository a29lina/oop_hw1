package org.example;

import java.util.ArrayList;

public class Products {
    String name;
    Double rating;
    Double price;
    ArrayList<Products> allProd = new ArrayList<>();
    public Products(String name, Double rating, Double price) {
        this.name = name;
        this.rating = rating;
        this.price = price;
    }

    public void addProd(Products products){
        allProd.add(products);
    }

    public static void showAll(ArrayList allProd){
        for (int i = 0; i < allProd.size(); i++) {
            System.out.println("Список всех товаров: " + allProd);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "name: " + name +
                ", rating: " + rating +
                ", price: " + price;
    }

}
