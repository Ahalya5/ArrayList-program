import com.inheritance1.Food;
import com.inheritance1.Sancks;

public class Eat1 {
    public static void main(String[] args){
        Food fo1= new Food("briyani",180,"nice","star");
        fo1.setName("vegrice");
        System.out.println(fo1.getName());
        System.out.println(fo1.getPrice());
        Sancks san1= new Sancks("samosa",10,10);
        System.out.println(san1.getPrice());
        san1.setNoOfBack(90);
        System.out.println(san1.getPrice());
    }
}
