import com.Number.Ascending;
import com.Number.Decending;

public class Oder {
    public static void main(String[] args){
        Ascending asc=new Ascending((float) 80.7,(float) 90.78);
        System.out.println(asc.getNum());
        asc.Percentage();
        Decending dec= new Decending((float) 78.90,(float) 89.09);
        System.out.println(dec.getPercentage());
        dec.floatNum();

    }
}