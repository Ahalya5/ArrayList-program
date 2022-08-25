import java.util.*;
import java.util.Collections;
public class Arraylistex2{
    public static void main(String[] args){
            ArrayList<String> number1=new ArrayList<String>();
            number1.add("900");
            number1.add("1000");
            number1.add("200");
            number1.add("900");
            number1.add("3090");
            number1.add("3450");
            System.out.println("NUMBER:"+number1);
            ArrayList<String> price=new ArrayList<String>();
            price.add("fist price  go to kumar and rupees");
            price.add("second price  go to ram and rupees");
            price.add("third price go to ram and rupees");
            price.add("fourth price  go to ram and rupees");
            price.add("fifth price  go to ram and rupees");
            price .add("sixth price  go to ram and rupees ");
            System.out.println("price :"+price);
            Collections.copy(number1,price);
            System.out.println(" price");
            System.out.println("price :"+price);
            System.out.println("NUMBER:"+number1);
    }
        }