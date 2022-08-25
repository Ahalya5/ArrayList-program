package com.Package;

public class Students extends Nameabract{

    public Students(String _name, double _height)
    {
        super(_name,_height);
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public double getHeight(){
        return height;
    }
    public void setHeight(double height){
        this.height=height;
    }
    public String StringName(){

        System.out.println(name);
        return null;
    }
}
