package com.Number;

public class Ascending {
    float num=12.9f;
    float percentage =95.90f;
    public Ascending(float _num, float _percentage){
        num = _num;
        percentage = _percentage;
    }
    public float getNum(){
        return num;
    }
    public void setNum(float num){
        this.num=num;

    }
    public float getPercentage(){
        return percentage;
    }
    public void setPercentage(float percentage){
        this.percentage=percentage;
    }
    public void Percentage(){
        System.out.println("the best percentages is:"+this.percentage);
    }

}
