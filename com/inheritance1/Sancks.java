package com.inheritance1;

public class Sancks{
    String name;
    int price;
    int  NoOfBack;

    public Sancks(String _name, int _price, int _NoOfBack) {
        name = _name;

        price = _price;
        NoOfBack = _NoOfBack;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getNoOfBack() {
        return NoOfBack;
    }

    public void setNoOfBack(int noOfBack) {
        NoOfBack = noOfBack;
    }
}
