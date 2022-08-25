import com.Book.Artical;
import com.Book.Read;

public class Notes {
    public static void main(String[] args){
        Artical art=new Artical("ponni selvan","Kalki",900);
        System.out.println(art.getPrice());
        art.setStory("romio");
        art.story();
        System.out.println(art.getStory());
        Read re=new Read("tamil","thiruvalluvar",1000);
        System.out.println(re.getStory());
        re.story();
    }
}