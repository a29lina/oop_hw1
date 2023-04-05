package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Products> allProd = new ArrayList<>();
        Products blue_skirt = new Products("blue skirt", 4.99, 12.50);
        Products white_skirt = new Products("white skirt", 4.89, 9.50);
        Products pink_dress = new Products("pink skirt", 5.0, 14.99);
        Products black_dress = new Products("black skirt", 4.99, 11.50);
        Products blue_jeans = new Products("blue jeans", 3.99, 17.50);

        allProd.add(blue_skirt);
        allProd.add(white_skirt);
        allProd.add(black_dress);
        allProd.add(pink_dress);
        allProd.add(blue_jeans);

        for (int i = 0; i < allProd.size(); i++) {
            System.out.println("Список всех товаров: " + allProd);
        }

        ArrayList<Products> basket_lst = new ArrayList<>();
        Basket basket = new Basket(basket_lst);
        User Mike = new User("Mike", "banana", basket);

        basket.addBasket(blue_jeans, allProd);

    }
}
