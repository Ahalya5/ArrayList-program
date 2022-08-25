package com.Book;

public class Read extends Artical{

    public Read(String _story, String _author, int _price) {
        super(_story, _author, _price);
    }
    public void story(){
        System.out.println("very nice for this stroy:"+this.story);
    }
}
