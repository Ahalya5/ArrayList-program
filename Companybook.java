import Override1.Book;
import Override1.Maths;

public class Companybook {
    public static void main(String[] args){
        Book bo1=new Book("human brain","way to success");
        System.out.println(bo1.getCompany());
        bo1.StringCompany();
        Maths ma1=new Maths("Gaied","local");
        System.out.println(ma1.getTopic());
        ma1.StringCompany();
    }
}