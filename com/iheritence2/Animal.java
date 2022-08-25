package com.iheritence2;
public class Animal {
    String name;
    String power;
    double weight;
    String colour;
    Animal(String _name, String _power, double _weight, String _colour) {
        name = _name;
        power = _power;
        weight = _weight;
        colour = _colour;
    }

    public String getName(){
        return name;
    }
    public  void setName(String name){
        this.name=name;
    }
    public String getPower(){
      return power;
    }
    public void setPower(String power){
      this.power=power;
    }
    public double getWeight(){
      return weight;
    }
    public void setWeight(double weight){
      this.weight=weight;
    }
    public String getColour(){
      return colour;
    }
    public void setColour(String colour){
      this.colour=colour;
    }
 }
