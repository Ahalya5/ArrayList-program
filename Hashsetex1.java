import java.util.*;
public class Hashsetex1 {
    public static void main(String[] args){
        HashSet<String> lap=new HashSet<>();
        lap.add("lenovo");
        lap.add("hp");
        lap.add("dell");
        lap.add("pad");
        lap.add("ilap");
        System.out.println(lap);
        System.out.println(lap.contains("oppo"));
        lap.remove("lenovo");
        System.out.println(lap);
        lap.add("apple");
        System.out.println(lap);
        lap.size();
        System.out.println(lap);
        lap.contains("pad");
        System.out.println(lap.contains("pad"));
        lap.clear();
        System.out.println(lap);

    }
}