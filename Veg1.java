import  Overrite.Market;
import Overrite.Vegtable;

public class Veg1 {
    public static void main(String[] args){
        Market mar=new Market("RA",8000000);
        System.out.println(mar.getPrice());
        Vegtable veg= new Vegtable("pees",90);
        veg.StringName();
        System.out.println(mar.getName());
    }
}