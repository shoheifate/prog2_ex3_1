import jp.ac.uryukyu.ie.ex3.pair04.Dice;
public class Main{
    public static void main(String[] args){
        Dice dice = new Dice();
        dice.play();
        System.out.println(dice.setValue((int)(Math.random()*6)+1));
    }
}