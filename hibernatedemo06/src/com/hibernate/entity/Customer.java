package com.hibernate.entity;

import java.util.List;

public class Customer {

    private int id;
    private String name;
    private String pwd;
    private String phone;
    private ShoppingCart shoppingCart;
    private List<Adress> adresses;

    public Customer() {
    }

    public ShoppingCart getShoppingCart() {
        return shoppingCart;
    }

    public void setShoppingCart(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    public Customer(int id, String name, String pwd, String phone, ShoppingCart shoppingCart, List<Adress> adresses) {
        this.id = id;
        this.name = name;
        this.pwd = pwd;
        this.phone = phone;
        this.shoppingCart = shoppingCart;
        this.adresses = adresses;
    }




    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pwd='" + pwd + '\'' +
                ", phone='" + phone + '\'' +
                ", shoppingCart=" + shoppingCart +
                ", adresses=" + adresses +
                '}';
    }

    public Customer(int id, String name, String pwd, String phone, List<Adress> adresses) {
        this.id = id;
        this.name = name;
        this.pwd = pwd;
        this.phone = phone;
        this.adresses = adresses;
    }

    public Customer(String name, String pwd, String phone) {
        this.name = name;
        this.pwd = pwd;
        this.phone = phone;
    }

    public Customer(int id, String name, String pwd, String phone) {
        this.id = id;
        this.name = name;
        this.pwd = pwd;
        this.phone = phone;
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

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public List<Adress> getAdresses() {
        return adresses;
    }

    public void setAdresses(List<Adress> adresses) {
        this.adresses = adresses;
    }
}
