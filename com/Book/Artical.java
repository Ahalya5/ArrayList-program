package com.Book;

public class Artical {
    String story;
    String author;
    int price;
    public Artical(String _story, String _author, int _price){
        story = _story;
        author = _author;
        price = _price;
    }
    public String getStory(){
        return story;
    }
    public void setStory(String story){
        this.story=story;
    }
    public String getAuthor(){
        return author;
    }
    public void setAuthor(String author){
        this.author= author;
    }
    public int getPrice(){
        return price;
    }
    public void setPrice(){
        this.price=price;
    }
    public void story(){
        System.out.println("This story was very nice:"+this.story);
    }
}
