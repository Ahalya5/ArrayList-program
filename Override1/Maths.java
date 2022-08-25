package Override1;

public class Maths extends Book {

    public Maths(String _topic, String _company) {
        super(_topic, _company);

    }
    public void StringCompany(){
        System.out.println("Book is the best company:"+this.company);
    }
}
