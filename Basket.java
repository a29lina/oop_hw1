package org.example;

import java.util.ArrayList;

public class Basket{

    Basket basket;
    ArrayList<Products> basket_lst = new ArrayList<>();

    public Basket(ArrayList<Products> basket_lst) {
        this.basket_lst = basket_lst;
    }

    public void addBasket(Products product, ArrayList allProd){
        basket_lst.add(product);
        allProd.remove(product);
        for (int i = 0; i < basket_lst.size(); i++) {
            System.out.println("Теперь в вашей корзине: " + basket_lst.get(i));
        }
        System.out.println("----------------");
        for (int i = 0; i < allProd.size(); i++) {
            System.out.println("Оставшиеся товары: " + allProd.get(i));
        }
    }


    @Override
    public String toString() {
        return "Basket{" +
                "Basket=" + basket +
                '}';
    }


}
