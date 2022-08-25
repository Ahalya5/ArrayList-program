import java.util.*;
public class Hashmapex2 {
    public static void main(String[] args){
        HashMap<String,Integer> dress=new HashMap<>();
        dress.put("ammarla",900);
        dress.put("geen",1600);
        dress.put("top",500);
        dress.put("shorttop",700);
        dress.put("longtop",1500);
        System.out.println(dress);
        for(Map.Entry d:dress.entrySet()){
            System.out.println(d.getKey()+" "+d.getValue());
        }
    }
}