package com.hibernate.entity;

import java.util.HashSet;
import java.util.Set;

public class Good {
    private int id;
    private String name;
    private double price;
    //商品库存
    private int inventory;
    //商品描述
    private String describes;

    private Set<ShoppingCart> shoppingCarts=new HashSet<ShoppingCart>();

    public Set<ShoppingCart> getShoppingCarts() {
        return shoppingCarts;
    }

    public void setShoppingCarts(Set<ShoppingCart> shoppingCarts) {
        this.shoppingCarts = shoppingCarts;
    }

    public Good(String name, double price, int inventory, String describes) {
        this.name = name;
        this.price = price;
        this.inventory = inventory;
        this.describes = describes;
    }

    @Override
    public String toString() {
        return "Good{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", inventory=" + inventory +
                ", describe='" + describes + '\'' +
                '}';
    }

    public Good() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    public int getInventory() {
        return inventory;
    }

    public void setInventory(int inventory) {
        this.inventory = inventory;
    }

    public String getDescribes() {
        return describes;
    }

    public void setDescribes(String describe) {
        this.describes = describes;
    }

    public Good(int id, String name, double price, int inventory, String describes) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.inventory = inventory;
        this.describes = describes;
    }
}
