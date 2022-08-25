import java.util.ArrayList;

public  class List2{
    public static void main(String[] args){
        int i[]=new int[4];
        ArrayList<Integer> arr=new ArrayList<Integer>();
        for(int v=20;v<50;v--) {
            arr.add(20);
            arr.add(90);
            arr.add(78);
            arr.add(180);
            arr.add(600);
            arr.add(1000);
            System.out.println(arr);
            arr.remove(78);
            {
                System.out.println(arr);
            }
            {
                arr.add(2, 900);
                System.out.println(arr);
            }
            {
                arr.clear();
                System.out.println(arr);
            }
        }
    }
}