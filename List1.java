import java.util.ArrayList;
public class List1{
    public static void main (String[] args){
        ArrayList<String> famliy=new ArrayList<>();
        famliy.add("amma");
        famliy.add("appa");
        famliy.add("pappa");
        famliy.add("thambi");
            System.out.println(famliy);
            for(String name:famliy){
                System.out.println(name);
                famliy.remove(1);
                System.out.println(famliy);
                System.out.println(famliy.get(2));
                famliy.add(3,"akka");
                System.out.println(famliy);
                famliy.clear();
                System.out.println(famliy);

            }

    }
}