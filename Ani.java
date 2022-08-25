 abstract class Domestic{
  public abstract void name();
   abstract void age();
    public abstract void weight();
}
class Picture extends Domestic{
    public void name(){
        System.out.println("ship");
    }
    public void age(){
        System.out.println("My age is 45");

    }
    public void weight(){
        System.out.println("My weight is 7.90");
    }
}
public  class Ani{
    public static void main(String[] args){
        Picture dom= new Picture() ;
        dom.age();
        dom.weight();
    }
}