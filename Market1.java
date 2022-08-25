import java.util.*;
class Vegtable {
    String name;
    static String colour;
    static int price;
    int kg;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static String getColour() {
        return colour;
    }

    public static void setColour(String colour) {
        Vegtable.colour = colour;
    }

    public static int getPrice() {
        return price;
    }

    public static void setPrice(int price) {
        Vegtable.price = price;
    }

    public int getKg() {
        return kg;
    }

    public void setKg(int kg) {
        this.kg = kg;
    }

    Vegtable(String _name, String _colour,int _price, int _kg) {
        name = _name;
        colour = _colour;
        price = _price;
        kg = _kg;

    }
}
     public class Market1 {
    public static void main(String[] args) {
        Vegtable veg1 = new Vegtable("corot", "orange", 90, 2);
        Vegtable veg2 = new Vegtable("pees","green",28,1);
        Vegtable veg3 = new Vegtable("tomoto","red",200,3);
        System.out.println(veg1.kg);
        System.out.println(veg3.price);
        System.out.println(veg2.name);
        veg1.setName("redgily");
        System.out.println(veg2.getName());
        System.out.println(veg3.getName());
        veg3.setColour("red");
        System.out.println(veg2.getColour());
        System.out.println(veg1.getColour());
        veg2.setPrice(500);
        System.out.println(veg1.getPrice());
        System.out.println(veg3.getPrice());
        veg2.setKg(7);
        System.out.println(veg2.getKg());
        System.out.println(veg1.getKg());
    }
}
