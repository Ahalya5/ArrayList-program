package com.inheritance1;

public class Food {
    String name;
    int price;
    String teast;
    String hotel;

    public Food(String _name, int _price, String _teast, String _hotel) {
        name = _name;
        price = _price;
        teast = _teast;
        hotel = _hotel;
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

    public String getTeast() {
        return teast;
    }

    public void setTeast(String teast) {
        this.teast = teast;
    }

    public String getHotel() {
        return hotel;
    }

    public void setHotel(String hotel) {
        this.hotel = hotel;
    }
}
