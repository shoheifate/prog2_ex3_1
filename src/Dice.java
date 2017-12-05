package jp.ac.uryukyu.ie.ex3.pair04;

public class Dice{
    private int value;
    //コンストラクタ                                                            
    public Dice(){
        System.out.println("サイコロを振る");
        play();
    }
    //value's getter                                                            
    public void getValue(){
        this.value = value;
    }
    //value's setter                                                            
    public int setValue(int value){
        return value;
    }
    //play method                                                               
    public void play(){
        this.value = (int)(Math.random()*6)+1;
    }
}