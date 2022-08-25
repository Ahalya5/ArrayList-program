import java.util.*;
public class Hashmapex3 {
    public static void main(String[] args) {
        Family f1 = new Family();
        f1.setFatherName("ramkumar");
        f1.setMotherName("ahalya");
        f1.setSonName("dharshith");
        System.out.println(f1.getFatherName());
        Family f2 = new Family();
        f2.setMotherName("arul");
        f2.setSonName("arun");
        f2.setFatherName("kumar");
        System.out.println(f2.getFatherName());
        Family f3 = new Family();
        f3.setFatherName("suriya");
        f3.setMotherName("priya");
        f3.setSonName("navalisha");
        System.out.println(f3.getSonName());
        HashMap<Family, Family> fa = new HashMap<>();
        fa.put(f1, f1);
        fa.put(f2, f2);
        fa.put(f3, f3);
        for (Family f : fa.keySet()) {
            System.out.println("family member is the :" + fa.keySet());
            fa.remove("suriya", "arul");
            System.out.println(fa);
            fa.clear();
            System.out.println(fa);

        }
    }
}