package org.example;

import java.util.ArrayList;

public class Category {
    String CategoryName;

    public Category(String categoryName) {
        CategoryName = categoryName;
    }

    public static void show() {
        ArrayList<Category> categories = new ArrayList<>();
        Category skirts = new Category("skirts");
        Category jeans = new Category("jeans");
        Category dresses = new Category("dresses");
        categories.add(skirts);
        categories.add(jeans);
        categories.add(dresses);
        for (int i = 0; i < categories.size(); i++) {
            System.out.println(categories.get(i));
        }
    }

    public String getCategoryName() {
        return CategoryName;
    }

    public void setCategoryName(String categoryName) {
        CategoryName = categoryName;
    }

    @Override
    public String toString() {
        return "Category: " + CategoryName;
    }
}
