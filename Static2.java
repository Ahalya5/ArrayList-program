import java.util.Scanner;
public class Static2{
    public static void main(String[] args){
        if(Num.t<50){
            System.out.println("less than t");
        }
        else {
            System.out.println("no match");
        }
        for (String obj :Num.name ){
            System.out.println(obj);

        }

    }
}

class Num{
    static int t = 20;
    static String[] name = {"ahalya", "agathiya"};
    }
