import java.util.Random;

public class Dice {
    int amountOfSides;
    int lastThrow;

    public int getAmountOfSides(){
        return this.amountOfSides;
    }

    public int getLastThrow(){
        return this.lastThrow;
    }

    public void rollDice(int amountOfSides){
        //Rolls dice
        Random random = new Random();
        int diceRoll = random.nextInt(amountOfSides + 1);

        System.out.println(diceRoll);
    }


}
