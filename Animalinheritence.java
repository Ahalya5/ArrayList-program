import com.iheritence2.Lion;
import com.iheritence2.Tiger;

public class Animalinheritence {
    public static void main(String[] args){
        Lion ani1=new Lion("king","forest raja",180,"ash brown",1.1);
        System.out.println(ani1.getHeight());
        ani1.setHeight(8);
        System.out.println(ani1.getHeight());
        Tiger ani2=new Tiger("panthera","population",140,"orange");
        ani2.setName("tigris");
        System.out.println(ani2.getName());
        System.out.println(ani2.getPower());
    }
}