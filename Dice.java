import java.util.Random;
import java.util.Scanner;
class Dice{
    public static void main(String[] args){
	Scanner s = new Scanner(System.in);
	System.out.println("What your name?");
	String str = s.nextLine();
	System.out.println("Hello, "+ str + "!");
	System.out.println("Rolling the dice...");
	Random rand = new Random();
	int i = rand.nextInt(6)%6 + 1;
	int j = rand.nextInt(6)%6 + 1;
	System.out.println("Die 1: " + i);
	System.out.println("Die 2: " + j);
	System.out.println("Total value: " + (i + j));
    }
}
