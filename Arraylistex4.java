import java.util.*;

public class Arraylistex4 {
    public static void main(String[] args) {
        Miss1 te1 = new Miss1("ram", "BE", 22, 5, "cholapuram");
        Miss1 te2 = new Miss1("vaishu", "b.com", 32, 8, "ond");
        Miss1 te3 = new Miss1("arul", "m.com", 22, 6, "cholapuram");
        Miss1 te4 = new Miss1("kumar", "b.ed", 20, 8, "cholapuram");
        Miss1 te5 = new Miss1("agathi", "me", 42, 9, "thennavai");
        Miss1 te6 = new Miss1("thiya", "m.ed", 22, 8, "cholapuram");
        Miss1 te7 = new Miss1("sanjay", "be", 22, 12, "thennavai");
        Miss1 te8 = new Miss1("akil", "bcom", 22, 9, "cholapuram");
        Miss1 te9 = new Miss1("ahal", "BE", 22, 8, "thekkur");
        Miss1 te10 = new Miss1("priya", "BE", 24, 10, "thekkur");

        ArrayList<Miss1> t1 = new ArrayList<>();
        t1.add(te1);
        t1.add(te2);
        t1.add(te3);
        t1.add(te4);
        t1.add(te5);
        t1.add(te6);
        t1.add(te7);
        t1.add(te8);
        t1.add(te9);
        t1.add(te10);

        System.out.println(Miss1.method1(t1,"thekkur"));
        System.out.println(Miss1.method2(t1,"cholapuram",8));
        System.out.println(Miss1.method3(t1,"cholopuram"));
        System.out.println(Miss1.method4(t1,"BE",22));
        System.out.println(Miss1.method5(t1,22));

    }




}



