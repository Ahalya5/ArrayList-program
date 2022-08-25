package com.Calinheritence;

class Calulation{
    int v;
    public void addition(int e,int y){
        v= e+y;
        System.out.println("number is the:"+v);
    }
    public void subtraction(int d,int h){
        v=d-h;
        System.out.println("number is the subtraction:"+v);
    }
    public class calculation extends Calinheritence{
        public void multi(int r,int w){
            v=r*w;
            System.out.println("the number multi is:"+v);
        }
    }
    public class Calinheritence{
        public static void main(String[] args){
            int e=20,d=90,r=10,w=40,h=60,y=70;
            Calulation cal =new Calulation();
            cal.addition(e,y);
            cal.subtraction(d,h);
            cal.multi(r,w);
        }
    }

    private int multi(int r, int w) {
        return w;
    }

}