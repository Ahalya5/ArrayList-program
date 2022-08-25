import java.util.HashSet;

public class Hashsetex3 {
    public static void main(String[] args){
        Book bk1=new Book();
        bk1.setName("ponnin selvan");
        bk1.setAuthor("priya");
        bk1.setPrice(800);
        System.out.println(bk1.getName());
        Book bk2= new Book();
        bk2.setName("thirukural");
        bk2.setAuthor("thiruvalluvar");
        bk2.setPrice(1000);
        System.out.println(bk2.getPrice());
        Book bk3= new Book();
        bk3.setName("ramayanam");
        bk3.setAuthor("raman");
        bk3.setPrice(9000);
        System.out.println(bk3.getAuthor());
        HashSet<Book> bo=new HashSet<>();
        bo.add(bk1);
        bo.add(bk2);
        bo.add(bk3);
        for(Book b:bo) {
            System.out.println("name:" + b.getName());
            System.out.println("author:"+b.getAuthor());
            System.out.println("price:"+b.getPrice());
        }
    }

    public static class Book {
        String name;
        String author;
        int price;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }

        public void setPrice() {
            this.price = price;
        }
    }




}