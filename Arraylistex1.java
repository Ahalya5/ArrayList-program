import java.util.*;
public class Arraylistex1 {
    public static void main(String[] args){
        ArrayList<String> colour=new ArrayList<>();
        colour.add("pink");
        colour.add("violet");
        colour.add("green");
        colour.add("blue");
        colour.add("white");
        colour.add("grey");
        colour.add("ash");
        System.out.println(colour);
        colour.remove(6);
        System.out.println(colour);
        colour.add(3,"sky bule");
        for (String obj:colour) {
            System.out.println(obj);
        }

        System.out.println(colour.size());

        for (int i = 0; i < colour.size(); i++) {
            System.out.println(i);

            System.out.println(colour.get(i));
        }
    }
}