package com.hibernate.entity;

public class Adress {


    private int id;
    //省
    private String province;
    //市
    private String city;
    //县/区
    private String county;
    //详细街道
    private String detailed;
    //邮政编码
    private String postalCode;
    //收货人姓名
    private String consignee;
    //收货人电话
    private String phone;

    private Customer customer;

    @Override
    public String toString() {
        return "Adress{" +
                "id=" + id +
                ", province='" + province + '\'' +
                ", city='" + city + '\'' +
                ", county='" + county + '\'' +
                ", detailed='" + detailed + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", consignee='" + consignee + '\'' +
                ", phone='" + phone + '\'' +
                ", customer=" + customer +
                '}';
    }

    public Adress(int id, String province, String city, String county, String detailed, String postalCode, String consignee, String phone) {
        this.id = id;
        this.province = province;
        this.city = city;
        this.county = county;
        this.detailed = detailed;
        this.postalCode = postalCode;
        this.consignee = consignee;
        this.phone = phone;
    }

    public Adress(int id, String province, String city, String county, String detailed, String postalCode, String consignee, String phone, Customer customer) {
        this.id = id;
        this.province = province;
        this.city = city;
        this.county = county;
        this.detailed = detailed;
        this.postalCode = postalCode;
        this.consignee = consignee;
        this.phone = phone;
        this.customer = customer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getDetailed() {
        return detailed;
    }

    public void setDetailed(String detailed) {
        this.detailed = detailed;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getConsignee() {
        return consignee;
    }

    public void setConsignee(String consignee) {
        this.consignee = consignee;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
