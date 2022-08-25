import java.util.LinkedList;

public class Linkedlist{
    private static boolean j;

    public static void main(String[] args){
        Name n1 =new Name("ahalya");
        Name n2=new Name("suriya");
        Name n3 =new Name("arul");
        Name n4 =new Name("ahalya");
        Name n5 = new Name("manju");

        LinkedList<Name> Namelist=new LinkedList<Name>();
        Namelist.add(n1);
        Namelist.add(n2);
        Namelist.add(n3);
        Namelist.add(n4);
        Namelist.add(n5);
        for(Name obj:Namelist){
            System.out.println(obj.name);
        }

    }

}
class Name{
    String name;

    Name(String _name){
        name = _name;
    }

}