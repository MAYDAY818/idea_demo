package com.hibernate.entity;

import java.util.HashSet;

import java.util.Set;

public class ShoppingCart {
    private int id;
    private int count;

    @Override
    public String toString() {
        return "ShoppingCart{" +
                "id=" + id +
                ", count=" + count +
                ", customer=" + customer +
                ", goodSet=" + goodSet +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Set<Good> getGoodSet() {
        return goodSet;
    }

    public void setGoodSet(Set<Good> goodSet) {
        this.goodSet = goodSet;
    }

    private Customer customer;
    private Set<Good> goodSet=new HashSet<Good>();

    public ShoppingCart(int id, int count) {
        this.id = id;
        this.count = count;
    }

    public ShoppingCart(int id, int count, Customer customer, Set<Good> goodSet) {
        this.id = id;
        this.count = count;
        this.customer = customer;
        this.goodSet = goodSet;
    }
}
