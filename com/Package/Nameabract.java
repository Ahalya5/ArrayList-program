package com.Package;

public class Nameabract {
   String name ;
   double height;
    public  Nameabract(String _name, double _height){
        name=_name;
        height = _height;
    }

    public String getName() {
        System.out.println("I am a Students.My name is" +this.getName());
        return null;
    }
        public void doubleHeight(){
            System.out.println("I am a Students.My height is"+this.height);
        }

        public void setName(String name){
        this.name=name;
        }
        public double getHeight(){
        return height;
        }
        public void setHeight(double height){
        this.height=height;
        }
}
