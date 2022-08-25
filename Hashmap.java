import java.util.*;
public class Hashmap {
    public static void main(String[] args){
        HashMap<Integer,String > mark=new HashMap<>();
        mark.put(89,"tamil");
        mark.put(90,"english");
        mark.put(78,"maths");
        mark.put(100,"science");
        mark.put(78,"social");
        System.out.println(mark);
        mark.get(100);
        System.out.println(mark.get(100));
        mark.remove(90);
        System.out.println(mark);
        mark.clear();
        System.out.println(mark);
    }
}