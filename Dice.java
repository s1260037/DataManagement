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
	if(i+j >= 7)System.out.println(str + " won!");
	else System.out.println(str + " lost...");
	System.out.println("rock-paper-scissors!!!!");
	System.out.println("SELECT!!  1:rock, 2:paper, 3:scissors");
	int r = s.nextInt();
	int k = rand.nextInt()%3 + 1;
	if(r == k) System.out.println(str + " even!");
	else if((r == 1 && k == 3) || (r == 2 && k == 1) || (r == 3 && k == 2))System.out.println(str + " WIN!!!");
	else System.out.println(str + " lose...");
    }
}
