import java.util.*;
public class Bike{
    public static void main(String[] args){
        Bikes bik1= new Bikes("priya motor",800000,"scooty",150);
        System.out.println(bik1);
        bik1.setPrice(100000);
        System.out.println(bik1.getPrice());
        Bikes bik2= new Bikes("dio",150000,"scooty",900);
        System.out.println(bik2);
        bik2.setMeters(6);
        System.out.println(bik2.getMeters());
        Bikes bik3= new Bikes("ttf",180000,"big bike",1900);
        System.out.println(bik3);
        bik3.setName("ttf");
        System.out.println(bik3.getName());
    }
}
class Bikes {
    public String name;
    private int price;
    public String company;
    private int meters;

    Bikes(String _name, int _price, String _company, int _meters) {
        name = _name;
        price = _price;
        company = _company;
        meters = _meters;
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

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getMeters() {
        return meters;
    }

    public void setMeters(int meters) {
        this.meters = meters;
    }
}

//    Bikes(String _name, int _price, String _company, int _meters) {
//        name = _name;
//        price = _price;
//        company = _company;
//        meters = _meters;
//    }
