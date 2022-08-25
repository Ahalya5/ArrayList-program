import java.util.*;
public class Hashset {
    public static void main(String[] args) {
        HashSet<Integer> marks = new HashSet<Integer>();
        marks.add(90);
        marks.add(100);
        marks.add(900);
        marks.add(500);
        marks.add(700);
        marks.add(900);
        System.out.println(marks);
        marks.remove(0);
        System.out.println(marks);
        marks.add(700);
        System.out.println(marks);
        marks.clear();
        System.out.println(marks);

        int english = 500;
        if (english > 900) {
            System.out.println("very good mark");
        } else if (english < 700) {
            System.out.println("good well");
        } else {
            System.out.println("poor");

        }
    }
}