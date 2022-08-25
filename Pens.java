import java.util.*;
public class Pens{
    public static void main(String[] args){
        Pen p1= new Pen("gel pen","flair",10,"blue","america");
        Pen p2= new Pen("ink pen","standard",50,"black","india");
        Pen p3= new Pen("stick pen","india mark",30,"sky blue","china");
        Pen p4= new Pen("found pen","cello",60,"red","india");
        Pen p5= new Pen("renals pen","flair click",100,"green","singapore");
        System.out.println(p1.price);
        System.out.println(p2.country);
        System.out.println(p3.company);
        System.out.println(p4.colour);
        System.out.println(p5.name);
    }
}
class Pen{
    String name;
    String company;
    int price;
    String colour;
    String country;
  public  Pen(String _name,String _company,int _price,String _colour,String _country){
        name = _name;
        company = _company;
        price = _price;
        colour = _colour;
        country = _country;
    }
}