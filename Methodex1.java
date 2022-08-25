import java.sql.SQLOutput;
import java.util.Scanner;
public class Methodex1{
    public static void main(String[] args) {
        Scanner input1 = new Scanner(System.in);
        System.out.println("enter the first number");
        int a = input1.nextInt();
        Scanner input2 = new Scanner(System.in);
        System.out.println("enter the second number");
        int b = input2.nextInt();
        Scanner input3 = new Scanner(System.in);
        System.out.println("enter the third number");
        int c = input3.nextInt();
        int d = add(a, b, c);
        System.out.println(d);
        int e = sub(a, b, c);
        System.out.println(e);
        int f = multi(a, b, c);
        System.out.println(f);
        int g = div(a, b, c);
        System.out.println(g);
        int h = mod(a, d, c);
        System.out.println(h);
    }
    public static int add (int a,int b,int c){
        return a+b+c;
    }
    public static int sub(int a,int b,int c) {
        return a-b-c;
    }
    public static int multi(int a,int b,int c) {
        return a*b*c;
    }
     public static int div(int a,int b,int c) {
         return a/b/c;
     }
     public static int mod(int a, int b ,int c){
        return a%b%c;
    }
}