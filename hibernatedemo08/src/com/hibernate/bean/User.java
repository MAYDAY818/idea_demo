package com.hibernate.bean;

public class User {
    private int id;
    private String name;
    private int age;
    private String sex;
    private String adress;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", adress='" + adress + '\'' +
                '}';
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public User(String name, int age, String sex, String adress) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.adress = adress;
    }

    public User() {
    }

    public User(int id, String name, int age, String sex, String adress) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.adress = adress;
    }
}
