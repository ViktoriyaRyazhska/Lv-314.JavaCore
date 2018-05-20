package com.homework;

import java.util.Objects;

public class Product {
    private String name;
    private double price;
    private int quantity;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Product() {}

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Double.compare(product.price, price) == 0 &&
                quantity == product.quantity &&
                Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, quantity);
    }

    public static int mostExpensiveItem(Product[] p) {
        double maxPrice = 0;
        int idx = 0;

        for (int i = 0; i < p.length; i++)
            if (p[i].price > maxPrice) {
                maxPrice = p[i].price;
                idx = i;
            }
        return idx;
    }

    public static int theBiggestQuantity(Product[] p) {
        int maxQuantity = 0;
        int idx = 0;

        for (int i = 0; i < p.length; i++) {
            if (p[i].quantity > maxQuantity){
                maxQuantity = p[i].quantity;
                idx = i;
            }
        }
        return idx;
    }

}
