package com.iheritence2;

public class Lion extends Animal{
    private double height;
    public Lion(String _name, String _power, double _weight, String _colour, double height){
    super(_name,_power,_weight,_colour);
    this.height=height;
    }

    public double getHeight() {
        return height;
    }
    public void setHeight(double height){
        this.height=height;
    }
}

