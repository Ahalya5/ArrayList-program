import java.util.*;
public class Hashmapex1 {
    public static void main(String[] args){
        HashMap<Double,String> animal=new HashMap<>();
        animal.put(7.90,"lion");
        animal.put(8.09,"tiger");
        animal.put(4.90,"cat");
        animal.put(2.89,"dog");
        System.out.println(animal);
        animal.size();
        System.out.println(animal);
        animal.remove(8.09,"tiger");
        System.out.println(animal);
        animal.get(2.89);
        System.out.println(animal.get(2.89));
        System.out.println(animal.keySet());
        animal.clear();
        System.out.println(animal);
    }
}