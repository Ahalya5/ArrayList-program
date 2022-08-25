  abstract class Laptop{
  abstract   void name();
  abstract void company();
  abstract void price();

}
class Mouse extends Laptop {
    public void name(){
        System.out.println("lop name is the HPlap78");
    }
    public void company(){
        System.out.println("HP");
    }
    public void price(){
        System.out.println("price is 50000");
    }
}
public  class Computer {
    public static void main(String[] args){
        Mouse mou=new Mouse();
        mou.company();
        mou.price();
    }
}