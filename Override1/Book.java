package Override1;

public class Book {
    String topic;
     String company;
     public Book(String _topic, String _company){
         topic = _topic;
         company = _company;
     }
     public String getTopic(){
         return topic;
     }
     public void setTopic(String topic){
         this.topic=topic;
     }
     public String getCompany(){
         return company;
     }
     public void setCompany(String company){
         this.topic=topic;
     }
     public void StringCompany(){
         System.out.println("No1 Company is:"+this.company);
     }
}
