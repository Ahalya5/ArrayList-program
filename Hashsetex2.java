import java.util.*;
public class Hashsetex2 {
    public static void main(String[] args){
        HashSet<String> job=new HashSet<>();
        job.add("IT");
        job.add("Goverment job VOA");
        job.add("ITI");
        job.add("Driver");
        System.out.println(job);
        Iterator<String> job1= job.iterator();
        System.out.println("which job is better now");
        System.out.println(job1.next());
        System.out.println(job1.next());
        job.size();
        System.out.println(job);
    }
}