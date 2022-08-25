import java.util.ArrayList;
public class List {
    public static void main(String[] args) {
        int r[] = new int[80];
        ArrayList<Integer> num = new ArrayList<Integer>();
        for (int b = 1; b < 2; b++){
            num.add(100);
            num.add(200);
            num.add(800);
            num.add(100);
            num.add(100);
            System.out.println(num);
        }
    }
}