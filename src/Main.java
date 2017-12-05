import jp.ac.uryukyu.ie.ex3.pair04.ExDice;
/*public class Main{
    public static void main(String[] args){
        Dice dice = new Dice();
        dice.play();
        System.out.println(dice.setValue((int)(Math.random()*6)+1));
    }
    }*/

public class Main {
    public static void main(String[] args){
	ExDice exdice = new ExDice(5, 7);
	for(int i=0; i<10; i++){
	    exdice.play();
	    System.out.println(exdice.setValue((int)(Math.random()*6)+1));  
	    //System.out.println(exdice.getValue());
	   
	}
    }
}