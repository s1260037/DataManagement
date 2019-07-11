import java.util.Random;
class Dice{
    public static void main(String[] args){
	System.out.println("Rolling the dice...");
	Random rand = new Random();
	int i = rand.nextInt(6)%6 + 1;
	int j = rand.nextInt(6)%6 + 1;
	System.out.println("Die 1: " + i);
	System.out.println("Die 2: " + j);
	System.out.println("Total value: " + (i + j));
    }
}
